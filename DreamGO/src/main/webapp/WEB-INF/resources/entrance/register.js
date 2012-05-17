$(document).ready(function() {
	$('#user').validate({
		debug : true,
		rules : {
			userName : {
				required : true
			},
			userPassword : {
				required : true
			},
			pad2 : {
				required : true,
				equalTo : "#password1"
			}
		},
		messages : {
			userName : {
				required : "用户名不能为空"
			},
			userPassword : {
				required : "密码不能为空"
			},
			pad2 : {
				required : "重复密码不能为空",
				equalTo : "重复密码必须与用户密码相同"
			}
		},
		submitHandler : function(form) {
			var user = {
				userName : $('#userName').val(),
				userPassword : $('#password2').val()
			};
			$.postJSON(form.action, user, function(data) {
				alert("id = " + data["id"]);
				alert("userName2 = " + data.id.userName);
			}, function(jqXHR, textStatus, errorThrown) {
				alert("jqXHR = " + jqXHR);
				console.log(jqXHR);
				alert("textStatus = " + textStatus);
				alert("errorThrown = " + errorThrown);
			});
		}
	});

});