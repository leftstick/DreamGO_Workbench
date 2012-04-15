$(document).ready(function() {
	
	$("form :input.required").each(function() {
		var $required = $("<strong class='high'> *</strong>"); // 创建元素
		$(this).parent().append($required); // 然后将它追加到文档中
	});
	
	function checkUserName(obj){
		var boo = true;
		 $('#userNameError').css("color","red");
		 var errorMsg;
		    if( obj.value === "" || $.trim(obj.value) === ""){
		    	errorMsg = "请输入至少5位的用户名.";
		    	boo = false;
		    }else if( obj.value.length < 5 ){
				errorMsg = "用户名格式不正确";
				boo = false;
			}else{
				errorMsg = "正确";
				 $('#userNameError').css("color","black");
			}
			$('#userNameError').text(errorMsg);
			return boo;
	}
	
	function checkPasswrod1(obj){
		var boo = true;
		 $('#password1Error').css("color","red");
		 var errorMsg;
		    if( obj.value === "" || $.trim(obj.value) === ""){
		    	errorMsg = "请输入密码.";
		    	boo = false;
		    }else if( obj.value.length < 6 || obj.value.length > 16 ){
				errorMsg = "登录密码不少于6位，不多于16位";
				boo = false;
			}else{
				errorMsg = "正确";
				 $('#password1Error').css("color","black");
			}
			$('#password1Error').text(errorMsg);
			return boo;
	 }
	
	function checkPassword2(obj){
		var boo = true;
		 $('#password2Error').css("color","red");
		 var errorMsg;
		    if( obj.value === "" || $.trim(obj.value) === ""){
		    	errorMsg = "请输入重复密码.";
		    	boo = false;
		    }else if( obj.value  !==  $('#password1').value){
				errorMsg = "两次输入的密码不相符";
				boo = false;
			}else{
				errorMsg = "正确";
				 $('#password2Error').css("color","black");
			}
			$('#password2Error').text(errorMsg);
			return boo;
	 	}
	
	$('form :input').blur(function(){
		 //验证用户名
		 if( $(this).is('#userName') ){
			    checkUserName(this);
			 }
		 //验证密码
		 if( $(this).is('#password1') ){
			 checkPasswrod1(this);
		 }
		 if( $(this).is('#password2') ){
			 checkPassword2(this);
		 }
	});


	$('#register').click(function(e) {
		if(!checkUserName($('#userName'))){
			e.preventDefault();
		}
		if(!checkPasswrod1($('#password1'))){
			e.preventDefault();
		}
		if(!checkPassword2($('#password2'))){
			e.preventDefault();
		}
	});
});