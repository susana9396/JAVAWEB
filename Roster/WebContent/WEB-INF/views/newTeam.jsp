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
	<h1>Create a new Team</h1>
	<form action="/Roster/teams" method="post">
	
		<input type="text" name="teamName" placeholder="Team Name" required="required">
		<input type="submit" value="Create">
	
	</form>
</body>
</html>