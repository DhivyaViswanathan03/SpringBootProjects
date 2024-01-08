<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListCustomers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		<input type='button' value='Add Customer'
				onclick="window.location.href='showForm'; return false;"
				class="add-button" />
		<table>
		<tr>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
		<th>EMAIL</th>
		<th>ACTION</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
		<c:url var="updateLink" value="/customer/showFormForUpdate">
		<c:param name="customerId" value="${customer.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/customer/showFormForDelete">
		<c:param name="customerId" value="${customer.id}"></c:param>
		</c:url>
		<tr>
		<td>${customer.firstName}</td>
		<td>${customer.lastName}</td>
		<td>${customer.email}</td>
		<td><a href="${updateLink}">UPDATE</a></td>
		<td><a href="${deleteLink}" onclick="if(!(confirm('Are u sure want to delete this customer?')))return false;">DELETE</a></td>
		</tr>
		</c:forEach>
		</table>
		</div>
		</div>
</body>
</html>