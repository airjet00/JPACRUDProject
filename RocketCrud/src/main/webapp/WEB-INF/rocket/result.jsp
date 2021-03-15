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
<c:when test="${rocket.name == null}"><h3>Rocket has been deleted</h3></c:when>

<c:otherwise>
<ul>

<li>${rocket.id} ${rocket.name}</li>
<li>${rocket.description}</li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>

</ul>
</c:otherwise>
</c:choose>
</body>
</html>