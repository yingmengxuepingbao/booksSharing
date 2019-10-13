var arrayObj = new Array();　//创建一个数组 	用于存储图片src
var arrayNumber = new Array();　//创建一个数组 存放删除的图片标识
var newArrayObj = new Array();
/**
 * 图片上传预受理
 * @param num 已上传的个数-0张
 * @param count 最多上传个数-1张
 * @param divId div编号
 * @param fileId 当前控件id
 * @returns
 */
function compress(num,count,divId,fileId) {
	var number = document.getElementById("number").value;//总控编码-用于标识图片编码
	let fileObj = document.getElementById(fileId); //上传logo文件的对象
	/**
	 * 图片预处理-压缩图处理
	 * @param num 已上传的个数-0张
	 * @param count 最多上传个数-1张
	 * @param obj 上传文件对象
	 * @param flag 标签标识:拼接图片
	 * @param number 用于标识图片
	 * @returns
	 */
	if(fileObj.files[0]!=undefined){//判断是否点击了取消
		 // 新建一个FileReader
	    const reader = new FileReader()
	    // 读取文件 
	    reader.readAsText(fileObj.files[0], "UTF-8")
	    // 读取完文件之后会回来这里
	    reader.onload = function(e){
		      // 读取文件内容
		      const fileString = e.target.result
		      // 接下来可对文件内容进行处理
		      arrayObj.push(fileString);//将文件内容放入数组
		 }
		$("#number").val(Number(number)+1);//标记增加1
		upAndDownload.compress(0,1,fileObj,divId,number);//上传下载的图片压缩
	}
}
/**
 * 此功能不需要删除图片
 * @param divNumber
 * @param number
 * @returns
 */
/*function delImg(divNumber,number,div_id){
	upAndDownload.delImg(divNumber,number,div_id);//删除图片
	 arrayNumber.push(number);//将删除的标识放入数组
}*/

/**
 * 页面加载-显示/隐藏div
 * @returns
 */
$(function () {
	//点击单选按钮后触发，即，认证方式：企业认证，营业执照显示；个人认证，身份证显示。
	$("input[name=authenticationMethod]").click(function(){
	    var authenticationMethod = $(this).val();
	    if(authenticationMethod == 1){//企业认证
	    	$("#qiye").show();
	    	$("#geren").hide();
	    }else if(authenticationMethod ==0){
	    	$("#geren").show();
	    	$("#qiye").hide();
	    }
	});	
})

/**
 * 确定提交按钮
 * @returns
 */
function sub(){
	var shopName = $("#shopName").val();
	//商店名称如果为空，显示提示语
	judgeEm(shopName,"shopName");
	var shopAddress = $("#shopAddress").val();
	judgeEm(shopAddress,"shopAddress");
	var shopPhone = $("#shopPhone").val();
	judgeEm(shopPhone,"shopPhone");
	var shopState =  $('input[name="shopState"]:checked').val(); 
	var shopSigning =  $('input[name="shopSigning"]:checked').val(); 
	var imgCount_logo = $("#imgCount_logo").children().length;//判断是否包含拼接的子节点。
	if(imgCount_logo >0){//长度大于0，存在子节点
		
	}else{
		judgeEm("","shopLogo");//如果没有添加图片，就返回。
		return;
	}
	console.log($("#imgCount_logo").children("img.myImg").attr("src"));//获取class为myImg的img
	$("#imgCount_logo>div>img").children(); //获取logo图片的src
	var authenticationMethod =  $('input[name="authenticationMethod"]:checked').val();
	if(authenticationMethod==0){
		var imgCount_picZheng = $("#imgCount_picZheng").innerHTML;
		judgeEm(imgCount_picZheng,"picZheng");
		var imgCount_picFan = $("#imgCount_picFan").innerHTML;
		judgeEm(imgCount_picFan,"picFan");
		var imgCount_picRen = $("#imgCount_picRen").innerHTML;
		judgeEm(imgCount_picRen,"picRen");
		var userName = $("#userName").val();
		judgeEm(userName,"userName");
		var userNumber = $("#userNumber").val();
		judgeEm(userNumber,"userNumber");
	}else if(authenticationMethod == 1){
		var imgCount_businessLicense = $("#imgCount_businessLicense").innerHTML;
		judgeEm(imgCount_businessLicense,"businessLicense");
		var xinyongCode = $("#xinyongCode").val();
		judgeEm(xinyongCode,"xinyongCode");
		var legalName = $("#legalName").val();
		judgeEm(legalName,"legalName");
	}
	var data = JSON.stringify({"shopName":shopName
		,"shopAddress":shopAddress
		,"shopPhone":shopPhone
		,"shopState":shopState
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		,"shopSigning":shopSigning
		
	});
	var getPort=upAndDownload.getPort();
	//当所有数据都不为空时，向后台提供数据
	$.ajax({
		 type: 'POST',
		  url: getPort+"",
		  data:data,
		  dataType:"json",
		  contentType: "application/json",
		  success:function (data) {
			 if(data.result=="sussess"){//存在数据时，拼接数据
				 window.alert("添加成功");
				 window.location.href = "../personalCenter/complaintRecord.html"
			 }else{
				 window.alert("添加失败");
			 }
		  }, 
		  error:function () {
			  window.alert("查询失败");
		  }
		});
}
/**
 * 判断是否非空
 * @param idFlag id标识
 * @returns
 */
function judgeEm(idFlag,flagId){
	if(idFlag =="" || idFlag==null || idFlag==undefined){
		$("#"+flagId+"Null").show();
	}else{
		$("#"+flagId+"Null").hide();
	}
}
