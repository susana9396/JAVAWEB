<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <a href="/Roster/home">Volver a Home</a>
	<h1>Add new Player a Team:<c:out value="${team.name}"/> </h1>
	
	<form action="/Roster/players" method="post">
	<input type="hidden" name="id" value="<c:out value="${team.id}"/>">
	<input type="text" name="fName" placeholder="FirstName" required="required" minlength="2"><br>
	<input type="text" name="lName" placeholder="LastName" required="required" minlength="2"><br>
	<input type="number" name="age" placeholder="Age" required="required" minlength="2"><br>
	<input type="submit" value="Add">
	
	</form>

</body>
</html>