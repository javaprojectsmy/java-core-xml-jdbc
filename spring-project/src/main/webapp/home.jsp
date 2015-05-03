<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		String contextPath = request.getContextPath();
	
	%>
	<h1>Home Page</h1>
	<p>${message}</p>
	<br />
	<a href="${contextPath}/customer/add">Add New
		Customer</a>

	<a href="${contextPath}/customer/list">List All
		Customers</a>

</body>
</html>