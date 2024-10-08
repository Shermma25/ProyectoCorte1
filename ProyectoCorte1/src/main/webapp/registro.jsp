<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registro de Productos</title>
<link href="styleRegistro.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<header class="header">
		<div class="menu container">
			<a class="navbar-brand" href="index.jsp"> <img
				src="Sources/logoExito.png" alt="" width="150" height="150">
			</a>
			<nav class="navbar">
				<ul>
					<li><a href="index.jsp"><button type="button"
								class="btn btn-outline-warning custom-back-button">Volver</button></a></li>

				</ul>
			</nav>
		</div>
	</header>

	<div class="wrapper">
		<h1>Registro de Productos</h1>
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
				<select id="tipo-alimentos" name="tipo_alimentos" required>
					<option value="" disabled selected>Tipo de alimento</option>
					<option value="vegetales">Vegetales</option>
					<option value="frutas">Frutas</option>
					<option value="carnes">Carnes</option>
					<option value="juguetes">Juguetes</option>
					<option value="otros">Otros</option>
				</select>
			</div>
			<div class="input-box">
				<input type="date" id="fecha" name="fecha" required>
			</div>
			<div class="input-box">
				<input type="number" id="num-unidades" name="num_unidades"
					placeholder="Número de unidades" required>
			</div>
			<div class="buttons">
				<button type="submit" class="btn btn-warning">Registrar
					Producto</button>
				<li><a href="dashboard.jsp"><button type="button"
							class="btn btn-outline-warning custom-back-button">Ver
							Registro</button></a></li>
			</div>
		</form>
	</div>

	<script>
		document.getElementById('productForm')
				.addEventListener(
						'submit',
						function(event) {
							event.preventDefault();

							const productName = document
									.getElementById('nombre-producto').value;
							const companyName = document
									.getElementById('empresa').value;
							const category = document
									.getElementById('tipo-alimentos').value;
							const expirationDate = document
									.getElementById('fecha').value;
							const units = document
									.getElementById('num-unidades').value;

							// Obtener productos del localStorage o inicializar como array vacío
							const products = JSON.parse(localStorage
									.getItem('products'))
									|| [];

							// Crear un nuevo producto
							const newProduct = {
								id : products.length + 1,
								name : productName,
								company : companyName,
								category : category,
								expirationDate : expirationDate,
								units : units
							};

							// Añadir el nuevo producto al array
							products.push(newProduct);

							// Guardar el array actualizado en localStorage
							localStorage.setItem('products', JSON
									.stringify(products));

							// Redirigir a dashboard.html
							window.location.href = 'dashboard.html';
						});
	</script>
</body>
</html>