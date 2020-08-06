<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador</title>
</head>
<body>
	<div>
		<form action="/Session/Counter" method=post>
			<input type="submit" value ="haga click"> 
		</form>
		<h1>Has hecho click <c:out value="${count}"></c:out> veces</h1>
	</div>
</body>
</html>