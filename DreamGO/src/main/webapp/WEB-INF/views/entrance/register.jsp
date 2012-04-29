<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ include file="/WEB-INF/views/common/header_top.jsp"%>
<html>
<head>
<link href="${resources}/entrance/register.css" rel="stylesheet" type="text/css">
<%@ include file="/WEB-INF/views/common/header_head.jsp"%>
<script type="text/javascript" src="${resources}/entrance/register.js"></script>
<title>梦想GO->注册</title>
</head>
<body>
<table>
	<form:form modelAttribute="user" name="user" action="/DreamGO/loginlogic/register" method="post">
	<tr>
	    <td colspan="3">加入DreamGO，讨论共同关注的话题</td>
	</tr>
	<tr>
	    <td>用户名：</td>
	    <td><input id="userName" name="userName"  class="required"></td>
	    <td><span id="userNameError" style="color: black;">请输入至少5位的用户名.<form:errors path="userName"></form:errors></span></td>
	</tr>
	<tr>
	    <td>登录密码：</td>
	    <td><input id="password1" name="userPassword"  class="required"></td>
	    <td><span id="password1Error">密码不少于6位，不超过16位</span></td>
	</tr>
	<tr>
	    <td>确认密码密码：</td>
	    <td><input id="password2"  name="pad2" class="required"></td>
	    <td><span id="password2Error">重复确认你的密码</span></td>
	</tr>
	<tr>
	    <td colspan="3"><input id="agreeterms"  type="checkbox"  value="我已经阅读并同意 "><a href="/DreamGO/common/terms">《服务条款》</a> </td>
	</tr>
	<tr>
	    <td colspan="2"><input id="register" type="submit" value="创建账号"></td>
	</tr>
	</form:form>
	</table>
</body>
</html>