<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<c:if test="${param.fail}">
		<div style="color:red;">ERROR</div>
	</c:if>
	<form:form action="/login">
		<input name="email">
		<input name="password" type="password">
		<button type="submit"></button>
	</form:form>
</body>
</html>