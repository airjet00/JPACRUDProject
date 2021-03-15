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
<br>
${rocket.diameter} <br> New diameter:<input type="text" name="diameter">
<br>
${rocket.country} <br> New country:<input type="text" name="country">
<br>
${rocket.costPerLaunch} <br> New Cost Per Launch:<input type="text" name="costPerLaunch">
<br>
${rocket.mass} <br> New mass:<input type="text" name="mass">
<br>


<input type="hidden" name="rid" value="${rocket.id}">
<input type="submit" value="Submit">

</form>
</body>
</html>