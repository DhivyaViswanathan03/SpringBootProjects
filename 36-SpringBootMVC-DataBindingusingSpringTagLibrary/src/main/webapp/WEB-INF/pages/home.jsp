<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<center>
<h1 style='color:red;text-align:center;'>
Employee Registration
</h1>
<form:form  modelAttribute="emp">
<table border='1'>
<tr>
<th>ENO</th>
<td><form:input  type="text" path='eno'/></td>
</tr>
<tr>
<th>ENAME</th>
<td><form:input  type="text" path='ename'/></td>
</tr>
<tr>
<th>EDESG</th>
<td><form:input  type="text" path='edesg'/></td>
</tr>
<tr>
<th>ESALARY</th>
<td><form:input  type="text" path='esalary'/></td>
</tr>
<tr>
<th></th>
<td><input type="submit" value="register"/></td>
</tr>
</table>
</form:form>
</center>
</body>
</html>