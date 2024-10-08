<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard - Grupo Éxito</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="styleDashBoard.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
	<header class="header">
		<div class="menu container">
			<a class="navbar-brand" href="index.jsp"> <img
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
								href="detalle-otros.jsp">Otros</a>
						</div>
					</li>
					<li><a href="index.jsp"><button type="button"
								class="btn btn-outline-warning">Volver</button></a></li>
				</ul>
			</nav>
		</div>
	</header>

	<div class="container">
		<h1 class="mt-5">Productos Registrados Frutas</h1>
		<table id="productTable" class="table table-striped custom-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre del Producto</th>
					<th>Empresa</th>
					<th>Fecha de Vencimiento</th>
					<th>Fecha de Cosecha</th>
					<th>Número de Unidades</th>
					<th>Es Orgánico</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<!-- Aquí se agregarán las filas de productos registrados -->
			</tbody>
		</table>
		<a href="crear-frutas.jsp" class="btn back-button mt-3">Volver al
			Registro de Productos</a>
	</div>

	<script>
        document.addEventListener('DOMContentLoaded', function () {
            const products = JSON.parse(localStorage.getItem('products')) || [];
            products
                .filter(product => product.category === 'frutas') // Filtra por categoría de frutas
                .forEach(product => {
                    addProductRow(product);
                });
        });

        function addProductRow(product) {
            const productTableBody = document.getElementById('productTable').getElementsByTagName('tbody')[0];
            const newRow = productTableBody.insertRow();
            newRow.insertCell(0).textContent = product.id;
            newRow.insertCell(1).textContent = product.name;
            newRow.insertCell(2).textContent = product.company;
            newRow.insertCell(3).textContent = product.expirationDate;
            newRow.insertCell(4).textContent = product.harvestDate;
            newRow.insertCell(5).textContent = product.units;
            newRow.insertCell(6).textContent = product.isOrganic === 'si' ? 'Sí' : 'No'; // Corregido a 'si'

            // Crear la columna de acciones
            const actionsCell = newRow.insertCell(7); // Columna 7 para acciones
            actionsCell.innerHTML = `
                <a href="editar-producto.html?id=${product.id}" class="btn btn-warning btn-sm me-2">Editar</a>
                <button class="btn btn-danger btn-sm" onclick="deleteProduct(${product.id})">Eliminar</button>
            `;
        }

        function deleteProduct(productId) {
            const products = JSON.parse(localStorage.getItem('products')) || [];
            const updatedProducts = products.filter(product => product.id !== productId);
            localStorage.setItem('products', JSON.stringify(updatedProducts));
            document.getElementById('productTable').getElementsByTagName('tbody')[0].innerHTML = '';
            updatedProducts
                .filter(product => product.category === 'frutas') // Refiltro después de eliminar
                .forEach(product => addProductRow(product));
        }
    </script>
</body>
</html>