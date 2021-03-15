<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Rocket</title>
</head>
<body>


<body>

<h1>Add the Rocket</h1>
<form action="addNewRocket.do" method="post">

Name:<input type="text" name="name">

Height:<input type="text" name="height">

Description:<input type="text" name="description">

Diameter:<input type="text" name="diameter">

Country:<input type="text" name="country">



<input type="submit" value="Add Rocket">

</form>

</body>
</html>