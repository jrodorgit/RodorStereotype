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
		<b>Modificacion Valor de Dominio.</b> <br />
		<form action="actualiza" method="post">
			<pre>
				
				<input type="hidden" name="id" value="${item.id}" />
				appdomain: <input type="text" name="appdomain" value="${item.appdomain}" />
				namedomain: <input type="text" name="namedomain"
					value="${item.namedomain}" />
				code: <input type="text" name="code" value="${item.code}" />
				description: <input type="text" name="description" value="${item.description}" />
				descriptionXL: <input type="text" name="descriptionXL" value="${item.descriptionXL}" />					
				descriptionXS: <input type="text" name="descriptionXS" value="${item.descriptionXS}" />
				startdate: <input type="text" name="startdate"
					value="${item.startdate}" />
				enddate: <input type="text" name="enddate"
					value="${item.enddate}" />
				
				<input type="submit" name="Save Domain Value" value="Save Domain Value" />
			</pre>

		</form>


	</div>


</body>
</html>