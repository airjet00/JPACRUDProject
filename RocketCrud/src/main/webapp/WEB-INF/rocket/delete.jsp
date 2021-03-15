<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Rocket</title>
</head>
<body>
<h1>Delete This Rocket?</h1>

<table>


<tr>
<td><strong>Rocket Id/Name: </strong>${rocket.id} ${rocket.name}</td>
</tr>

<tr>
<td><strong>Description: </strong>${rocket.description}</td>
</tr>



</table>

<form action="deleteRocket.do" method="post">
<input type="hidden" name="rid" value="${rocket.id}">
<input type="submit" value="confirm">
</form>

</body>
</html>