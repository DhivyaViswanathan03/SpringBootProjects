</center><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<%-- <%-- <center> --%>
<!-- <h1 style='color:red;text-align:center;'>SAMPLE VALUES</h1> -->
<%-- <h1>Name is:${name}</h1>
<h1>Age is:${age}</h1>
<h1>Address is:${address}</h1> --%>

<!-- <h1 style='color:red;text-align:center;'>ARRAY VALUES</h1> -->
<!-- <b>COUNTRYNAMES</b></br> -->
<%-- <c:forEach var="country" items="${countryNames}">
${country}</br>
</c:forEach> --%>

<!-- <h1 style='color:red;text-align:center;'>LIST VALUES</h1> -->
<!-- <b>JAVACOURSE</b></br> -->
<%-- <c:forEach var="subject" items="${subjectsList}">
${subject}</br>
</c:forEach> --%>


<!-- <h1 style='color:red;text-align:center;'>SET VALUES</h1> -->
<!-- <b>MOBILENOS</b></br> -->
<%-- <c:forEach var="mobile" items="${mobileNos}">
${mobile}</br>
</c:forEach>
 --%>
<!-- <h1 style='color:red;text-align:center;'>MAP VALUES</h1> -->
<!-- <b>MOBILENOS</b></br> -->
<%-- <c:forEach var="pDetails" items="${personalDetails}">
${pDetails.key}======>${pDetails.value}</br>
</c:forEach>
</center> --%> 
<center>
<h1 style='color:red;text-align:center;'>LIST OF EMP DTO</h1>

<table border=1>
<tr>
<th>ENO</th>
<th>ENAME</th>
<th>EDESG</th>
<th>ESAL</th>
</tr>
<c:forEach var="empVal" items="${empList}">
<tr>
<td>${empVal.eno}</td>
<td>${empVal.ename}</td>
<td>${empVal.edesg}</td>
<td>${empVal.esalary}</td>
</tr>
</c:forEach>
</table>

<h1 style='color:red;text-align:center;'>EMP MODEL OBJECT</h1>
ENO:${emp.eno}</br>
ENAME:${emp.ename}</br>
EDESG:${emp.edesg}</br>
ESALARY:${emp.esalary}</br>
</center>

</body>
</html>