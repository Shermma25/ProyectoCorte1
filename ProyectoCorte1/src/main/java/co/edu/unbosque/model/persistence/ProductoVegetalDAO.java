package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoVegetalDTO;

public class ProductoVegetalDAO implements CRUDOperation<ProductoVegetalDTO> {

	private ArrayList<ProductoVegetalDTO> listaVegetales;

	public ProductoVegetalDAO() {
		listaVegetales = new ArrayList<ProductoVegetalDTO>();

	}

	@Override
	public void crear(ProductoVegetalDTO nuevo) {
		listaVegetales.add(nuevo);

	}

	@Override
	public int eliminar(ProductoVegetalDTO dato) {
		if (listaVegetales.remove(dato)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int eliminar(int index) {
		if (listaVegetales.remove(index) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<ProductoVegetalDTO> mostrar() {
		return new ArrayList<>(listaVegetales);
	}

	@Override
	public int cantidad() {
		return listaVegetales.size();
	}

	public int actualizar(int UID, ProductoVegetalDTO nuevoDato) {
		for (int i = 0; i < listaVegetales.size(); i++) {
			if (listaVegetales.get(i).getUID() == UID) {
				listaVegetales.set(i, nuevoDato);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<ProductoVegetalDTO> getListaVegetales() {
		return listaVegetales;
	}

	public void setListaVegetales(ArrayList<ProductoVegetalDTO> listaVegetales) {
		this.listaVegetales = listaVegetales;
	}

}
