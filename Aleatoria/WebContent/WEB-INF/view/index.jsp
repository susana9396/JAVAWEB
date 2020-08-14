<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>You have generated a word  <c:out value="${count}"/> times</h1>
		<c:out value="${alphanum}"/>
		<form action="/Aleatoria/Random" method=get>
			<input type="submit" value ="Generate"> 
		</form>
		<h1>The last time you generated a word was:</h1>
		<c:out value="${hoy}"/>
	</div>
</body>
</html>