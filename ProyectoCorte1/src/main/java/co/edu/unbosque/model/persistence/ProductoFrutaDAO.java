package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoFrutaDTO;

public class ProductoFrutaDAO implements CRUDOperation<ProductoFrutaDTO> {

	private ArrayList<ProductoFrutaDTO> listaFrutas;

	public ProductoFrutaDAO() {
		listaFrutas = new ArrayList<ProductoFrutaDTO>();

	}

	@Override
	public void crear(ProductoFrutaDTO nuevo) {
		listaFrutas.add(nuevo);

	}

	@Override
	public int eliminar(ProductoFrutaDTO dato) {
		if (listaFrutas.remove(dato)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int eliminar(int index) {
		if (listaFrutas.remove(index) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<ProductoFrutaDTO> mostrar() {
		return new ArrayList<>(listaFrutas);
	}

	@Override
	public int cantidad() {
		return listaFrutas.size();
	}

	@Override
	public int actualizar(int index, ProductoFrutaDTO nuevoDato) {
		if (listaFrutas.set(index, nuevoDato) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	public ArrayList<ProductoFrutaDTO> getListaFrutas() {
		return listaFrutas;
	}

	public void setListaFrutas(ArrayList<ProductoFrutaDTO> listaFrutas) {
		this.listaFrutas = listaFrutas;
	}

}
