<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
	<script>
		$(document).ready(function() {
			$("#submitBtn").click(function() {
				var usr = $("#usr").val();
				var app = $("#app").val();
				$("#authorities").empty();
				$.ajax({
					url : "rest/authsApp?usr=" + usr + "&app=" + app
				}).then(function(data) {

					jQuery.each(data, function(i, val) {
						var ul = document.getElementById("authorities");
						var li = document.createElement("li");
						li.appendChild(document.createTextNode(val));
						ul.appendChild(li);
					});

				});
			});
		});
	</script>
	<div class="container">
		<label>User / App</label>
		<div class="row">
			<form id="usrApp">
				Codigo Usuario: <input id="usr" type="text" name="usr" value="" />
				Codigo Aplicacion: <input id="app" type="text" name="app" value="" />
				<button type="button" id="submitBtn">Show Auths</button>
			</form>
		</div>
	</div>
	<div class="container">
		<label>Auths</label>
		<div class="row">
			<ul id="authorities">
			</ul>
		</div>
	</div>
</body>
</html>