<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<h1>Update Rocket</h1>
<form action="updateRocket.do" method="post">

${rocket.name} <br> New Name:<input type="text" name="name">
<br>
${rocket.height} <br> New Height:<input type="text" name="height">
<br>
${rocket.description} <br> New description:<input type="text" name="description">
<input type="hidden" name="rid" value="${rocket.id}">
<br>


<input type="submit" value="Submit">

</form>
</body>
</html>