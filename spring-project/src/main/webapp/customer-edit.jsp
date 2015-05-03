<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer Page</title>
</head>
<body>
	<h1>Add Customer Page</h1>
	<%
		String contextPath = pageContext.request.getContextPath();
	%>
	<form:form commandName="customer" method="post"
		action="${contextPath}/customer/edit/${customer.id}">
		<table>
			<tbody>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><form:input path="age" />(dd/MM/yyyy)</td>
				</tr>
				<tr>
					<td><input type="submit" value="Edit"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<p>
		<a href="${contextPath}/index">Home Page</a>
	</p>
</body>
</html>