<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rockets</title>
</head>
<body>

<h1>Rockets are cool</h1>
<h3>Search Rocket by ID</h3>
<form action="" method="get">Rocket ID:
<input type="text" name="rid">
<input type="submit" value="Search">
</form>
<h3>Search Rocket by Name</h3>
<form action="getRocket" method="GET">Rocket Name:
<input type="text" name="rid">
<input type="submit" value="Search">
</form>

<h3>Add New Rocket</h3>
<form action="addRocket.do" method="GET">
<input type="submit" value="Add">
</form>

<h3>Update Rocket</h3>
<form action="updateRocketForm.do" method="GET">
ID: <input type="text" name=rid>
<input type="submit" value="Submit">
</form>

<h3>Delete Rocket</h3>
<form action="deleteRocketForm.do" method="GET">
ID: <input type="text" name=rid>
<input type="submit" value="Submit">

</form>

<table>
<c:forEach var="r" items="${rockets}">

<tr>
<td>ID &nbsp ${r.id} &nbsp&nbsp&nbsp <a href="getRocket.do?rid=${r.id}">	${r.name} </a></td>
</tr>

<tr>
<td><strong>${r.description}</strong></td>
</tr>

</c:forEach>
</table>

<%-- <a href="">${rock.name}</a> 
<strong>${rock.description}</strong> --%>

</body>
</html>