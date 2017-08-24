<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Category</title>
<style type="text/css">
	.form-horizontal .control-label{
		text-align: left;
	}
</style>
</head>
<body>
	<div class="container" >
		<div class="row">
			<div class="col-sm-12">
				<form:form class="form-horizontal" modelAttribute="category"  action="/admin/category/" method="POST">
					<div class="form-group">
					<form:errors path="name" element="div">
					</form:errors>
							<label for="name" class="control-lable col-sm-2" >Name</label>
						<div class="col-sm-10">
							<form:input type="text" path="name" id="name" class="form-control"/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-10 col-sm-offset-2">
							<button class="btn btn-success" type="submit">Create</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
		<div class="col-sm-12">
			<table width="100%" class="table table-bordered">
				<tr>
					<th>Name</th>
					<th class="text-center">Update</th>
					<th class="text-center">Delete</th>
				</tr>
				<c:forEach items="${categorys}" var="category">
				<tr>
					<td>${renttype.name}</td>
					<td class="text-center"><a href="/admin/category/update/${category.id}" class="btn btn-warning">Update</a></td>
					<td class="text-center"><a href="/admin/category/delete/${category.id}" class="btn btn-danger">Delete</a></td>
				</tr>
				</c:forEach>
			</table>
			</div>
		</div>
	</div>
	<button class="btn btn-success" type="submit"><a href="/admin">Back</a></button>
</body>
</html>