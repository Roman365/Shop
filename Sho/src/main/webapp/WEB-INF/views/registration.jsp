<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" action="/registration" type="POST">
		<lable>Email :<form:input path="email"/></lable><br>
		<lable>Password :<form:input path="password"/></lable><br>
		<form:errors path="/registration">

		</form:errors>
		<lable>Name<form:input path="name"/></lable><br>
		<button type="submit">Save</button>
	</form:form>

</body>
</html>