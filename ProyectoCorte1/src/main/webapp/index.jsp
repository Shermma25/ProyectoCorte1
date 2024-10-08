<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Grupo Éxito</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="style.css" rel="stylesheet" type="text/css" />
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
			<nav class="navbar">
				<ul>
					<li class="btn-desplegable">
						<button class="btn btn-outline-warning">
							Registrar <i class="fa-solid fa-chevron-down"></i>
						</button>
						<div class="btn-navbar-content">
							<a href="crear-Vegetales.jsp">Vegetales</a> <a
								href="crear-frutas.jsp">Frutas</a> <a href="crear-carnes.jsp">Carnes</a>
							<a href="crear-juguetes.jsp">Juguetes</a> <a
								href="crear-otros.jsp">Otros</a>

						</div>
					</li>
					<li class="btn-desplegable">
						<button class="btn btn-outline-warning">
							Ver productos <i class="fa-solid fa-chevron-down"></i>
						</button>
						<div class="btn-navbar-content">
							<a href="ver-vegetales.jsp">Vegetales</a> <a
								href="ver-frutas.jsp">Frutas</a> <a href="ver-carnes.jsp">Carnes</a>
							<a href="ver-juguetes.jsp">Juguetes</a> <a href="ver-otros.jsp">Otros</a>
							<a href="ver-todos.jsp">Todos</a>

						</div>
					</li>

					<li class="btn-desplegable">
						<button class="btn btn-outline-warning">
							Detalles productos <i class="fa-solid fa-chevron-down"></i>
						</button>
						<div class="btn-navbar-content">
							<a href="detalleVegetales.jsp">Vegetales</a> <a
								href="detalleFrutas.jsp">Frutas</a> <a href="detalleCarne.jsp">Carnes</a>
							<a href="detalleJuguete.jsp">Juguetes</a> <a
								href="detalleOtrosProductos.jsp">Otros</a>
						</div>
					</li>

					<li><a href="login.jsp"><button type="button"
								class="btn btn-outline-warning">Volver</button></a></li>
				</ul>
			</nav>
		</div>
	</header>

	<div id="carouselExampleControls" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="Sources/portadaExito.jpeg" class="d-block w-100">
			</div>
			<div class="carousel-item">
				<img src="Sources/FOTOPORTADA2.jpg" class="d-block w-100">
			</div>
			<div class="carousel-item">
				<img src="Sources/portada3.jpg" class="d-block w-100">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<footer class="news py-5">
		<div class="container py-5">
			<div class="row">
				<div class="col-lg-9 m-auto text-center">
					<h1>Disfrutamos tus mensajes</h1>
					<input type="text" class="px-3" placeholder="Ingrese su E-mail">
					<button class="btn2">Enviar</button>
				</div>
			</div>
			<div class="row pt-5">
				<div class="col-lg-11 m-auto">
					<div class="row">
						<div class="col-lg-3 py-3">
							<h4 class="pb-3">INTERACTUAR</h4>
							<a style="color: white;" href="index.jsp" id="Inicio">Inicio
								<br>
							</a> <a style="color: white;" href="login.jsp" id="Inicio">Iniciar
								sesión</a>

						</div>
						<div class="col-lg-3 py-3">
							<h4 class="pb-3">Operaciones</h4>
							<p>Registrar</p>
							<p>Mostrar</p>
							<p>Eliminar</p>
							<p>Actualizar</p>
						</div>
						<div class="col-lg-3 py-3">
							<h4 class="pb-3">PRODUCTOS</h4>
							<p>Carnes</p>
							<p>Vegetales</p>
							<p>frutas</p>
							<p>juguetes</p>
							<p>otros</p>
						</div>
						<div class="col-lg-3 py-3">
							<h4 class="pb-3">CONTACTANOS</h4>
							<i class="fab fa-instagram"></i> <i class="fa-brands fa-facebook"></i>
							<i class="fa-brands fa-twitter"></i>
						</div>
					</div>
				</div>
			</div>
			<hr>
			<p class="text-center">Copyright @2024 Derechos reservados</p>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>