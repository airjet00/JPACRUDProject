<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rocket Result</title>
</head>
<body>
<h1>Rocket Result</h1>
<c:choose>
<c:when test="${rocket.name == null}"><h3>Rocket has been deleted</h3>
<form action="home.do">
<input type="submit" value="HOME">
</form>
</c:when>
<c:otherwise>
<table>

<tr>
<td>${rocket.id} ${rocket.name}</td>
</tr>
<tr>
<td>${rocket.description}</td>
</tr>
<tr>
<td>${rocket.diameter}</td>
</tr>
<tr>
<td>${rocket.country}</td>
</tr>
<tr>
<td>${rocket.costPerLaunch}</td>
</tr>
<tr>
<td>${rocket.mass}</td>
</tr>



</table>
<form action="home.do">
<input type="submit" value="HOME">
</form>
</c:otherwise>
</c:choose>
</body>
</html>