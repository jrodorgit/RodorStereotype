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
	<div class="container">
	<label>Dominios.</label>
		<div class="row">
			<form id="appsForm">
				<pre><label>Aplicaciones.</label>
					<select>
					<c:forEach items="${apps}" var="item"><option value="${item.appdomain}">${item.appdomain}</option>
					</c:forEach>
					</select>
					<%-- <c:forEach items="${apps}" var="item">
		    		${item.appdomain}<br>
					</c:forEach> --%>
				</pre>
			</form>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<b>Listado de Valores de Dominios. <a
				class="btn btn-xs btn-default"
				href="<c:url value="/domains/nuevaDomainValue"/>"><span
					class="glyphicon glyphicon-plus">Add Valor Dominio</span></a></b> <br />
			<c:forEach items="${lst}" var="item">
    		${item} - <a class="btn btn-xs btn-default"
					href="<c:url value="/domains/editDomain?id=${item.id}"/>"><span
					class="glyphicon glyphicon-edit"></span></a> - <a
					class="btn btn-xs btn-default"
					href="<c:url value="/domains/borrarDomain?id=${item.id}"/>"><span
					class="glyphicon glyphicon-trash"></span></a>
				<br>
			</c:forEach>
		</div>
	</div>


</body>
</html>