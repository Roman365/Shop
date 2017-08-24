<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Welcome</title>
</head>
<body>
	<sec:authorize access="isAuthenticated()">
		<form:form action="/logout">
				<button type="submit">Logout</button>
		</form:form>
	</sec:authorize>
		
	
	<h2>Welcome</h2>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
					<a href="/admin">Admin</a>
			</sec:authorize>
					<a href="/product">Product</a>
					<a href="/login">Login</a>
					
</body>
</html>