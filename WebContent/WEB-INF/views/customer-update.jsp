<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update-customer</title>
</head>
<body>

	<h1>List  Customer</h1>
	<a href="${pageContext.request.contextPath }/customer-list"></a>
	
	<form:form action="${pageContext.request.contextPath }/customer-update" method="Post" modelAttribute="customer">
		<table>
			<tr>
				<td>ID: </td>
				<td> <form:input path="id" value="${customer.id }" readonly="true"/> </td>
			</tr>
			<tr>
				<td>Name: </td>
				<td> <form:input path="name" value="${customer.name }" /> </td>
			</tr>
			<tr>
				<td>Address: </td>
				<td> <form:input path="address" value="${customer.address }"/> </td>
			</tr>
			<tr>
				<td colspan="2"> <button type="submit">Update</button> </td>
			</tr>
		</table>
	</form:form>

</body>
</html>