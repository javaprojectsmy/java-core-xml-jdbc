<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Customers</title>
</head>
<body>
	<%
		String contextPath = pageContext.request.getContextPath();
	%>
	<h1>Customers List Page</h1>
	<table class="table table-striped" border="1px">
		<thead>
			<tr>
				<th width="10%">id</th>
				<th width="15%">name</th>
				<th width="10%">DOB</th>
				<th width="10%">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customer" items="${customers}">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.name}</td>
					<td>${customer.age}</td>
					<td><a
						href="${contextPath}/customer/edit/${customer.id}">
							Edit </a></td>
					<td><a
						href="${contextPath}/customer/delete/${customer.id}">
							Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<a href="${contextPath}/index">Home Page</a>
	</p>
</body>
</html>