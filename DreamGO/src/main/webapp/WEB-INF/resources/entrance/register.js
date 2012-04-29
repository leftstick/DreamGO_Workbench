$(document).ready(function() {
	
	
	$("form :input.required").each(function() {
		var $required = $("<strong class='high'> *</strong>"); // 创建元素
		$(this).parent().append($required); // 然后将它追加到文档中
	});
	
	function checkUserName(userName){
		var boo = true;
		 $('#userNameError').css("color","red");
		 var errorMsg;
		    if( userName === "" || $.trim(userName) === ""){
		    	errorMsg = "请输入至少5位的用户名.";
		    	boo = false;
		    }else if( userName.length < 5 ){
				errorMsg = "用户名格式不正确";
				boo = false;
			}else{
				errorMsg = "正确";
				 $('#userNameError').css("color","black");
			}
			$('#userNameError').text(errorMsg);
			return boo;
	}
	
	function checkPasswrod1(password){
		var boo = true;
		 $('#password1Error').css("color","red");
		 var errorMsg;
		    if( password === "" || $.trim(password) === ""){
		    	errorMsg = "请输入密码.";
		    	boo = false;
		    }else if( password.length < 6 || password.length > 16 ){
				errorMsg = "登录密码不少于6位，不多于16位";
				boo = false;
			}else{
				errorMsg = "正确";
				 $('#password1Error').css("color","black");
			}
			$('#password1Error').text(errorMsg);
			return boo;
	 }
	
	function checkPassword2(password){
		var boo = true;
		 $('#password2Error').css("color","red");
		 var errorMsg;
		    if( password === "" || $.trim(password) === ""){
		    	errorMsg = "请输入重复密码.";
		    	boo = false;
		    }else if( password  !==  $('#password1').val()){
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
			    checkUserName(this.value);
			 }
		 //验证密码
		 if( $(this).is('#password1') ){
			 checkPasswrod1(this.value);
		 }
		 if( $(this).is('#password2') ){
			 checkPassword2(this.value);
		 }
	});


	$('#user').submit(function() {
		if(!checkUserName($('#userName').val()) || !checkPasswrod1($('#password1').val()) || !checkPassword2($('#password2').val())){
			return false;
		}
		var user = {userName : $('#userName').val(),userPassword : $('#password2').val()};
		$.postJSON(this.action, user, function(data) {
			alert("success");
		},function(jqXHR, textStatus, errorThrown){
			alert("jqXHR = "+jqXHR);
			alert("textStatus = "+textStatus);
			alert("errorThrown = "+errorThrown);
		});
		return false;
	});
});