<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListCustomers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/add-customer-style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
	<h3>SAVE CUSTOMER</h3>
		<form:form method="POST" action="saveCustomer" modelAttribute="customer">

		<form:hidden path="id"/>

		<table>
		<tr>
		<td>FIRST NAME
		</td>
		<td>
		<form:input path="firstName"/>
		</td>
		</tr>
		<tr>
		<td>LAST NAME
		</td>
		<td>
		<form:input path="lastName"/>
		</td>
		</tr>
		<tr>
		<td>EMAIL
		</td>
		<td>
		<form:input path="email"/>
		</td>
		</tr>
		<tr>
		<td>
		</td>
		<td>
		<input type="submit" value="save" class="save"/>
		</td>
		</tr>
		</table>
		</form:form>
		</div>
		
		<p>
			<a href='${pageContext.request.contextPath}/customer/list'>Back to List</a>
		</p>
		
</body>
</html>