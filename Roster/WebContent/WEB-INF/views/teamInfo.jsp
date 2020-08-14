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
	<h1>Team: <c:out value="${team.name}"></c:out></h1>
	<a href="/Roster/players?id=<c:out value="${team.id}"/>">New Player</a>

	
		<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Action</th>
		</tr>
		<c:forEach var="player" items="${team.players}">
		<tr>
			<td><c:out value="${player.firstName}"/></td>
			<td><c:out value="${player.lastName}"/></td>
			<td><c:out value="${player.age}"/></td>
			<td>
					
					<a href="/Roster/playerDelete?id=<c:out value="${player.id}"/>&teamId=<c:out value="${team.id}"/>">Delete</a>
			</td>
			
		
		</tr>
		</c:forEach>
	</table>


</body>
</html>