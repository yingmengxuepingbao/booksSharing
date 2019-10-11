//对图片进行压缩
var arrayObj = new Array();　//创建一个数组 	用于存储图片src
var arrayNumber = new Array();　//创建一个数组 存放删除的图片标识
var newArrayObj = new Array();

/**
 * 图片预处理
 * @param num 已上传的个数
 * @param count 最多上传个数
 * @param obj 上传文件对象
 * @param flag 标签标识
 * @param number 用于标识图片
 * @returns
 */
function compress(num,count,obj,flag,number) { //已上传num张，最多上传count张图片。
	let fileObj = file.files[0]; //上传文件的对象
	 // 新建一个FileReader
    const reader = new FileReader()
    // 读取文件 
    reader.readAsText(fileObj, "UTF-8")
    // 读取完文件之后会回来这里
    reader.onload = function(e){
      // 读取文件内容
      const fileString = e.target.result
      // 接下来可对文件内容进行处理
      arrayObj.push(fileString);//将文件内容放入数组
    }
    
    if(fileObj !=undefined){//点击确定走/取消退出
		if(num<count){//如果张数少于指定的个数
			num;
			var str ="<div class='del_div' id='del"+number+"' style='display:inline-block;margin-left:10px;'>" 
				+"<img class='chahao' id='chahao"+number+"' src='../../img/personalCenter/chahao.png' onclick='delImg(del"+number+","+number+")'>" 
				+"<img id='img"+number+"'  src=''  class='myImg' name='complaintVoucherPicture'>"
				+"</div>";
			flag.append(str);
		}else{
			return;
		}
		//图片缩图
		let reader = new FileReader();
	    reader.readAsDataURL(fileObj);
	    reader.onload = function(e) {
	        let image = new Image(); //新建一个img标签（还没嵌入DOM节点)
	        image.src = e.target.result;
	        image.onload = function() {
	            let canvas = document.createElement('canvas'), 
	            context = canvas.getContext('2d'),
	            imageWidth = image.width / 2,    //压缩后图片的大小
	            imageHeight = image.height / 2,
	            data = '';

	            canvas.width = imageWidth;
	            canvas.height = imageHeight;

	            context.drawImage(image, 0, 0, imageWidth, imageHeight);
	            data = canvas.toDataURL('image/jpeg');
	            //压缩完成 
	            document.getElementById('img'+number).src = data;
	            //arrayObj.push(data);//将图片放入数组
	            number++;
	        }
   
        }
    }
}
//删除凭证图片
function delImg(divNumber,number){
    imgCount.removeChild(divNumber);
    //$("#count").val(Number($("#count").val())-Number(1));
    arrayNumber.push(number);//将删除的标识放入数组
}