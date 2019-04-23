<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	(function($) {
		$(document).ready(
				function() {
					$('ul.dropdown-menu [data-toggle=dropdown]')
							.on(
									'click',
									function(event) {
										event.preventDefault();
										event.stopPropagation();
										$(this).parent().siblings()
												.removeClass('open');
										$(this).parent().toggleClass('open');
									});
				});
	})(jQuery);
</script>
<nav class="navbar navbar-inverse navbar-static-top">
	<div class="container">
		<ul class="nav navbar-nav">
			<c:forEach items="${modulos}" var="modulo">
				<!-- Opciones de Menu  - Modulos -->
				<c:choose>
					<c:when test="${empty modulo.submenus}">
						<li> <a  href="${modulo.uri}"> ${modulo.code}</a> </li>
  					</c:when>
					<c:otherwise>
						<li class="dropdown"><a class="dropdown-toggle"
							aria-expanded="false" href="#" data-toggle="dropdown"
							data-hover="dropdown">${modulo.code}</a>
							<!-- Opciones de submenu del Modulo -->
							<ul class="dropdown-menu">
								<c:forEach items="${modulo.submenus}" var="submenu">
								<li><a href="${submenu.uri}">${submenu.code}</a></li>
								</c:forEach>
							</ul></li>
					</c:otherwise>
				</c:choose>


			</c:forEach>
		</ul>
	</div>
</nav>