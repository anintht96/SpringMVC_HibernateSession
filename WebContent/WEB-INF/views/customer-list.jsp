<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>

	<h1>List Customer</h1>
	<a href="customer-save">Add Customer</a>
	<br>
	<br>
	
	<table border="1">
		<tr>
			<th>ID </th>
			<th>Name </th>
			<th>Address </th> 
			<th>View </th>
			<th>Edit </th>
			<th>Delete </th>
		</tr>
		<c:if test="${not empty list }">
			<c:forEach items="${list }" var="item">
				<tr>
					<td>${item.id } </td>
					<td>${item.name } </td>
					<td>${item.address } </td>
					<td> <a href="customer-view/${item.id }">View</a> </td>
					<td> <a href="customer-update/${item.id }">Edit</a> </td>
					<td> <a href="customer-delete/${item.id }">Delete</a> </td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>