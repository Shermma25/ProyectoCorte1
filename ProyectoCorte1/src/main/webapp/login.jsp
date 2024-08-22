<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<title>Grupo Éxito</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="styleAcceder.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	integrity="sha512-hz9KK72L4BOE4E+gszCEWcBh08Djzql6tP0ur1gjF0ghs3Zle6jNYx5YxIVl5RUuD7xlFd9hbI5jrf4WfFblHg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
	<header class="header">
		<div class="menu container">
			<a class="navbar-brand" href="login.jsp"> <img
				src="Sources/logoExito.png" alt="" width="150" height="150">
			</a>
			<nav class="navbar"></nav>
		</div>
	</header>

	<div id="header-placeholder"></div>

	<div class="wrapper">
		<!-- Contenido de la página -->
		<form action="">
			<h1>Login</h1>
			<div class="input-box">
				<input type="text" placeholder="usuario" required>
			</div>
			<div class="input-box">
				<input type="password" placeholder="contraseña" required>
			</div>
			<div class="remember-forgot">
				<label><input type="checkbox">Recordar</label> <a href="#">Olvidaste
					tu contraseña?</a>
			</div>
			<a href="index.jsp"><button type="button" class="btn btn-warning">Acceder</button></a>
			<div class="register-link">
				<p>
					No tienes una cuenta? <a href="#">Registrate</a>
				</p>
			</div>
		</form>
	</div>

	<script>
		// Cargar el encabezado desde header.html
		document.getElementById("header-placeholder").innerHTML = '<object type="text/html" data="header.html"></object>';
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>

</html>