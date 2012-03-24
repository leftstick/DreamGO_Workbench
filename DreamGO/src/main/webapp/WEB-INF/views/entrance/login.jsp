<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ include file="/WEB-INF/views/common/header_top.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/views/common/header_head.jsp"%>
<link href="${resources}/login.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${resources}/login.js"></script>
<title>梦想GO</title>
</head>
<body>
<ul>
  <li>潜力挖掘</li>
  <li>职业爱好与从事职业适合度</li>
  <li>个性化职业规划指导</li>
  <li>团队角色扮</li>
  <li>人脉积累</li>
</ul>
<table>
	<form:form modelAttribute="user" name="user" action="/DreamGO/loginlogic/login" method="post">
	<tr>
	    <td>用户名：</td>
	    <td><input name="userName"><form:errors path="userName"></form:errors></td>
	</tr>
	<tr>
	    <td>密码：</td>
	    <td><input name="userPassword"><form:errors path="userPassword"></form:errors></td>
	</tr>
	<tr>
	    <td colspan="2"><a href="#">忘记密码</a></td>
	</tr>
	<tr>
	    <td colspan="2"><input id="login" type="submit" value="登录"/></td>
	</tr>
	</form:form>
	</table>
</body>
</html>
