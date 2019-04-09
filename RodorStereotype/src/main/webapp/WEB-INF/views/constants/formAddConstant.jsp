<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RODOR - STEREOTYPE PROJECT</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest Jquery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
	type="text/javascript"></script>
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container">
		<b>Alta Nueva Constante.</b> <br />
		<form action="add" method="post" >
			<pre>
				Clave: <input type="text" name="clave" value="" clave"" />
				Descripcion: <input type="text" name="descripcion" 	value="descripcion" />
				Fecha Inicio Valor: <input type="text" name="fechaInicio" value="2019-01-01 01:00:00.0" />
				Fecha Fin Valor: <input type="text" name="fechaFin" value="2020-01-01 01:00:00.0" />
				
				<input type="submit" name="Add Nueva Constante"
					value="Add Nueva Constante" />
			</pre>

		</form>


	</div>


</body>
</html>