<%@ page contentType="text/html;charset=utf-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="content-Type" content="text/html;charset=UTF-8">
<title>Create Account</title>
</head>
<body>
	<form:form  modelAttribute="user" action="login" method="post">
		<fieldset>
			<legend>Login page</legend>
			<p>
				<form:label id="nameLabel" for="name" path="name"
					cssErrorClass="error">Name</form:label>
				<br />
				<form:input path="name" />
				<form:errors path="name" />
			</p>
			<p>
				<form:label for="password" path="password">Password</form:label>
				<br />
				<form:input path="password" />
				<form:errors path="password" />
			</p>
			<p>
				<input id="login" type="submit" value="Login" />
			</p>
		</fieldset>
	</form:form>
</body>
</html>
