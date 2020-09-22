<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save</title>
</head>
<body>

	<a href="customer-list">List Customer</a>

	<form:form action="customer-save" modelAttribute="customer" method="Post">
		Name: <form:input path="name"/> <br>
		Address: <form:input path="address"/> <br>
		<button type="submit">Save</button>
	</form:form>

</body>
</html>