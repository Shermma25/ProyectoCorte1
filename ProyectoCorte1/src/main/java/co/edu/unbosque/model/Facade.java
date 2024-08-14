package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class Facade {

	private ProductoCarneDAO productoCarneDAO;
	private ProductoFrutaDAO productoFrutaDAO;
	private ProductoJugueteDAO productoJugueteDAO;
	private ProductoRandomDAO productoRandomDAO;
	private ProductoVegetalDAO productoVegetalDAO;

	public Facade() {

		setProductoCarneDAO(new ProductoCarneDAO());
		setProductoFrutaDAO(new ProductoFrutaDAO());
		setProductoJugueteDAO(new ProductoJugueteDAO());
		setProductoRandomDAO(new ProductoRandomDAO());
		setProductoVegetalDAO(new ProductoVegetalDAO());

	}

	public ProductoCarneDAO getProductoCarneDAO() {
		return productoCarneDAO;
	}

	public void setProductoCarneDAO(ProductoCarneDAO productoCarneDAO) {
		this.productoCarneDAO = productoCarneDAO;
	}

	public ProductoFrutaDAO getProductoFrutaDAO() {
		return productoFrutaDAO;
	}

	public void setProductoFrutaDAO(ProductoFrutaDAO productoFrutaDAO) {
		this.productoFrutaDAO = productoFrutaDAO;
	}

	public ProductoJugueteDAO getProductoJugueteDAO() {
		return productoJugueteDAO;
	}

	public void setProductoJugueteDAO(ProductoJugueteDAO productoJugueteDAO) {
		this.productoJugueteDAO = productoJugueteDAO;
	}

	public ProductoRandomDAO getProductoRandomDAO() {
		return productoRandomDAO;
	}

	public void setProductoRandomDAO(ProductoRandomDAO productoRandomDAO) {
		this.productoRandomDAO = productoRandomDAO;
	}

	public ProductoVegetalDAO getProductoVegetalDAO() {
		return productoVegetalDAO;
	}

	public void setProductoVegetalDAO(ProductoVegetalDAO productoVegetalDAO) {
		this.productoVegetalDAO = productoVegetalDAO;
	}

}
