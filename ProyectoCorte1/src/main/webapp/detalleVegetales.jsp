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

<link href="styleDetalleProducto.css" rel="stylesheet" type="text/css" />
</head>


<header class="header">
	<div class="menu container">
		<a class="navbar-brand" href="index.jsp"> <img
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

				<li><a href="index.jsp"><button type="button"
							class="btn btn-outline-warning">Volver</button></a></li>
			</ul>
		</nav>
	</div>
</header>

<div class="container py-0">
	<div class="row py-0">
		<div class="col-lg-5 m-auto text-center">
			<h3>VEGETALES FRESCOS</h3>
		</div>
	</div>
	<div class="row row-cols-sm1 row-cols-md-2 row-cols-lg-3 row-cols-xl-3">
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2">
				<h5 class="card-title pt-2 text-center">Lechuga</h5>
				<img src="Sources/lechuga.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">Fresca, crujiente y de
						calidad, perfecta para ensaladas y guarniciones. ¡Lleva lo mejor a
						tu mesa y disfruta de su sabor!</p>
				</div>
			</div>
		</div>
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2" style="width: 45rem;">
				<h5 class="card-title pt-2 text-center">Zanahoria</h5>
				<img src="Sources/zanahoria.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">¡Deliciosas zanahorias,
						frescas y llenas de color! Dulces, crujientes y ricas en
						vitaminas, perfectas para ensaladas.</p>
				</div>
			</div>
		</div>
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2" style="width: 45rem;">
				<h5 class="card-title pt-2 text-center">Espinaca</h5>
				<img src="Sources/espinaca.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">Tierna y nutritiva, rica en
						hierro y vitaminas, perfecta para añadir salud y sabor a tus
						comidas diarias.</p>
				</div>
			</div>
		</div>
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2" style="width: 45rem;">
				<h5 class="card-title pt-2 text-center">Cebolla</h5>
				<img src="Sources/cebolla.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">Crujiente y llena de sabor,
						perfecta para sofritos, ensaladas o como base en tus recetas
						favoritas.</p>
				</div>
			</div>
		</div>
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2" style="width: 45rem;">
				<h5 class="card-title pt-2 text-center">Cilantro</h5>
				<img src="Sources/cilantro.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">Fresco y aromático, ideal para
						dar un toque de sabor a salsas, ensaladas y guisos. ¡Un esencial
						en la cocina!.</p>
				</div>
			</div>
		</div>
		<div class="col d-flex justyfy-content-center mb-4">
			<div class="card border-0 bg-light-mb-2">
				<h5 class="card-title pt-2 text-center">Berenjena</h5>
				<img src="Sources/berenjena.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text description">Suave y versátil, perfecta
						para asados, guisos o a la parrilla. Añade textura y sabor único a
						tus platos.</p>
				</div>
			</div>
		</div>
	</div>
</div>
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
						<a style="color: white;" href="index.html" id="Inicio">Inicio
							<br>
						</a> <a style="color: white;" href="registrarse.jsp" id="Inicio">Registrarse<br></a>
						<a style="color: white;" href="login.jsp" id="Inicio">Iniciar
							sesión</a>

					</div>
					<div class="col-lg-3 py-3">
						<h4 class="pb-3">SERVICIOS</h4>
						<p>Alojamiento</p>
						<p>Eventos</p>
						<p>Instalaciones</p>
					</div>
					<div class="col-lg-3 py-3">
						<h4 class="pb-3">PRODUCTOS</h4>
						<p>Rom service</p>
						<p>Bar</p>
						<p>restaurente</p>
					</div>
					<div class="col-lg-3 py-3">
						<h4 class="pb-3">CONTACTANOS</h4>
						<i class="fa-brands fa-instagram"></i> <i
							class="fa-brands fa-facebook"></i> <i
							class="fa-brands fa-twitter"></i>
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

</div>

</body>

</html>