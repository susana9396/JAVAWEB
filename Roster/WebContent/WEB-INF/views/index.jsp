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

    <h1>HOME</h1>
	<h1>Prototype Roster</h1>
	
	<a href="/Roster/teams">New team</a>
	
	<table>
		<tr>
			<th>Team</th>
			<th>Size</th>
			<th>Action</th>
			
		</tr>
	
	
		
	<c:forEach var="team" items="${roster.teams}">
		<tr>
			<td><c:out value="${team.name}"/></td>
			<td><c:out value="${team.size}"/></td>
			<td>
					<a href="/Roster/teams?id=<c:out value="${team.id}"/>">Details</a>
					<a href="/Roster/teamDelete?teamId=<c:out value="${team.id}"/>">Delete</a>
			</td>
			
		
		</tr>
		
	</c:forEach>
	</table>

</body>
</html>