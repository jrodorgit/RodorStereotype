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
		<b>Modificacion Constante.</b> <br />
		<form action="actualiza" method="post" >
			<pre>
				
				Id: <input type="text" name="id" value="${item.id}" />
				Clave: <input type="text" name="clave" value="${item.clave}" />
				Descripcion: <input type="text" name="descripcion" 	value="${item.descripcion}" />
				Fecha Inicio Valor: <input type="text" name="fechaInicio" value="${item.fechaInicio}" />
				Fecha Fin Valor: <input type="text" name="fechaFin" value="${item.fechaFin}" />
				
				<input type="submit" name="Save Constante"
					value="Save Constante" />
			</pre>

		</form>


	</div>


</body>
</html>