<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<link rel='stylesheet' type='text/css' media='screen'
	href='../css/cabecera.css'>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header class="header">
		<div class="container logo-nav-container">
			<a href="#" class="logo">
                            fabrica
                            <c:out value="${requestScope.pgTitle}" />
                        
                        </a> <span class="menu-icon"></span>
			<nav class="navigation">
				<ul class="show">
					<li><a href="#">incio</a></li>
					<li><a href="#">Acerca de</a></li>
					<li><a href="#">Servicios</a></li>
					<li><a href="#">Cliente</a></li>
					<li><a href="#">Contacto</a></li>
				</ul>
			</nav>
		</div>
	</header>
</body>
</html>