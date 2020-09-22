<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view-customer</title>
</head>
<body>

	<h1>View Customer</h1>
	<a href="${pageContext.request.contextPath }/customer-save">Add Customer</a>

	<table>
		<tr>
			<td>ID: </td>
			<td>${view.id }</td>
		</tr>
		<tr>
			<td>Name: </td>
			<td>${view.name } </td>
		</tr>
		<tr>
			<td>Address: </td>
			<td>${view.address } </td>
		</tr>	
	</table>

</body>
</html>