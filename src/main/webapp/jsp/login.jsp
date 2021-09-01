<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel='stylesheet' type='text/css' media='screen' href="${pageContext.request.contextPath}/css/login.css">
	<meta charset="UTF-8">
	<title>Muebleria </title>
</head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



<body >
	<div id="login">
		<h3 class="caja">Mi Mueblerita</h3>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<!-- action es lo que realizara con el llenado del formulario
							
						--iframe es para poder reutilizar codigo  -->
						<form id="login-form" class="form" action="${pageContext.request.contextPath}/iniciar" method="post">
							<h3 class="text-center text-info">Login</h3>
							<div class="form-group">
								<label for="username" class="text-info">Usuario:</label><br>
								<input type="text" name="usuario" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">contraseña:</label><br>
								<input type="text" name="password" id="password" class="form-control">
							</div>
							
							<div class="form-group">
								<label for="remember-me" class="text-info"><span>Remember me </span>?<span>
								<input id="remember-me" name="remember-me"type="checkbox"></span>
								</label><br>
								<!-- sumit valida el formulario -->
								<input type="submit" name="submit" class="btn btn-info btn-md" value="Entrar">
							</div>
							<div id="register-link" class="text-right">
								<a href="#" class="text-info">Mas opciones</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>