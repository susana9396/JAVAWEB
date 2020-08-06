<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css"> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<h1>VETERINARIA PANCHITO</h1>
	<div class="formulario">
		<h1>Ingresa los datos de tu Gato:</h1>	
		<form action="/Mascotas/ShowCat" method=post>
			<input type="text" name ="name" placeholder="Nombre del Gato"><br>
			<input type="text" name ="breed" placeholder="Raza de tu Mascota"><br>
			<input type="text" name ="weight" placeholder="Peso de tu Mascota"><br>
			<input type="submit" value ="Enviar"> 
		</form>
	</div>
	<div class="formulario">
		<h1>Ingresa los datos de tu Perro:</h1>	
		<form action="/Mascotas/ShowDog" method=post>
			<input type="text" name ="name" placeholder="Nombre del Perro"><br>
			<input type="text" name ="breed" placeholder="Raza de tu Mascota"><br>
			<input type="text" name ="weight" placeholder="Peso de tu Mascota"><br>
			<input type="submit" value ="Enviar"> 
		</form>
	</div>
</div>
</body>
</html>