var upAndDownload;//上传下载
var chaHao="../../img/share/chahao.png";//❌图标
//对图片进行压缩
(function(){
	upAndDownload={
			/**
			 * 获取公共路径方法
			 * @returns
			 */
			getPort:function(){
				return "http://localhost:8080";  //公共路径
			},
			/**
			 * 图片预处理-压缩图处理
			 * @param num 已上传的个数
			 * @param count 最多上传个数
			 * @param obj 上传文件对象
			 * @param divId 标签标识
			 * @param number 用于标识图片
			 * @returns
			 */
			compress:function(num,count,f_obj,divId,number){
				let fileObj = f_obj.files[0]; //上传文件的对象
			    if(fileObj !=undefined){//点击确定走/取消退出
			    	var str="";//拼接标签串
			    	var div_id = (document.getElementById(divId).childNodes)[5].id;//获取要拼接div的id
					if(num<count && count ==1){//如果是一张图片，不需要删除标识，重新上传即可
						str ="<div class='del_div' id='del"+number+"' style='display:inline-block;margin-left:10px;'>" 
							+"<img id='img"+number+"'  src='' class='myImg' name='complaintVoucherPicture'>"
							+"</div>";
						console.log((document.getElementById(divId).childNodes)[5]);
						(document.getElementById(divId).childNodes)[5].innerHTML=str;
					}else if(num<count){//如果张数少于指定的个数
						 str ="<div class='del_div' id='del"+number+"' style='display:inline-block;margin-left:10px;'>" 
							+"<img class='chahao' id='chahao"+number+"' src='"+chaHao+"' onclick='delImg(del"+number+","+number+","+div_id+")'>" 
							+"<img id='img"+number+"'  src='' class='myImg' name='complaintVoucherPicture'>"
							+"</div>";
						console.log((document.getElementById(divId).childNodes)[5]);
						$("#"+div_id+"").append(str);
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
				            document.getElementById('img'+number).src =data;
				        }
			   
			        }
			    }
			},
			/** 删除凭证图片
			 * @param divNumber 要删除的div编号
			 * @param number 用于标识图片
			 * @param div_id  div id标识
			 * @returns
			 */
			delImg:function(divNumber,number,div_id){
				div_id.remove(divNumber);//将div id标识下的div编号删除
			}
	}
})();
