<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<a href="<spring:url value="/"/>" class="navbar-brand">RODOR - STEREOTYPE PROJECT</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="<spring:url value="/constants/"/>">Constants</a></li>
		</ul>
		<ul class="nav navbar-nav">
			<li><a href="<spring:url value="/domains/"/>">Domains</a></li>
		</ul>
		<ul class="nav navbar-nav">
			<li><a href="<spring:url value="/navs/"/>">Navs</a></li>
		</ul>
		<ul class="nav navbar-nav">
			<li><a href="<spring:url value="/roles/"/>">Authorities</a></li>
		</ul>
	</div>
</nav>