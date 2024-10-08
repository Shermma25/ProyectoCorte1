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
<link href="styleRegistro.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	integrity="sha512-hz9KK72L4BOE4E+gszCEWcBh08Djzql6tP0ur1gjF0ghs3Zle6jNYx5YxIVl5RUuD7xlFd9hbI5jrf4WfFblHg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<header class="header">
		<div class="menu container">
			<a class="navbar-brand" href="login.jsp"> <img
				src="Sources/logoExito.png" alt="Logo Éxito" width="150"
				height="150">
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
					</li>
					<li><a href="login.jsp"><button type="button"
								class="btn btn-outline-warning">Volver</button></a></li>
				</ul>
			</nav>
		</div>
	</header>

	<div class="wrapper" style="margin-top: 20px; padding-top: 0;">
		<h1>Registro de Juguetes</h1>
		<form id="productForm">
			<div class="input-box">
				<input type="text" id="nombre-producto" name="nombre_producto"
					placeholder="Nombre del producto" required>
			</div>
			<div class="input-box">
				<input type="text" id="empresa" name="empresa" placeholder="Empresa"
					required>
			</div>
			<div class="input-box">
				<input type="number" id="num-jugadores" name="num-jugadores"
					placeholder="Número de jugadore" required>
			</div>
			<div class="input-box">
				<input type="number" id="edad-min" name="edad-min"
					placeholder="edad-min" required>
			</div>
			<div class="input-box">
				<input type="number" id="num-unidades" name="num_unidades"
					placeholder="Número de unidades" required>
			</div>
			<div class="buttons">
				<button type="submit" class="btn btn-warning">Registrar
					Producto</button>
			</div>
		</form>
	</div>
</body>
</html>