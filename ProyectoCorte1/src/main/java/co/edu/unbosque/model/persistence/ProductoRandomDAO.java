package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoCarneDTO;
import co.edu.unbosque.model.ProductoRandomDTO;

public class ProductoRandomDAO implements CRUDOperation<ProductoRandomDTO> {

	private ArrayList<ProductoRandomDTO> listaRandoms;

	public ProductoRandomDAO() {
		listaRandoms = new ArrayList<ProductoRandomDTO>();

	}

	@Override
	public void crear(ProductoRandomDTO nuevo) {
		listaRandoms.add(nuevo);

	}

	@Override
	public int eliminar(ProductoRandomDTO dato) {
		if (listaRandoms.remove(dato)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int eliminar(int index) {
		if (listaRandoms.remove(index) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<ProductoRandomDTO> mostrar() {
		return new ArrayList<>(listaRandoms);
	}

	@Override
	public int cantidad() {
		return listaRandoms.size();
	}

	public int actualizar(int UID, ProductoRandomDTO nuevoDato) {
		for (int i = 0; i < listaRandoms.size(); i++) {
			if (listaRandoms.get(i).getUID() == UID) {
				listaRandoms.set(i, nuevoDato);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<ProductoRandomDTO> getListaRandoms() {
		return listaRandoms;
	}

	public void setListaRandoms(ArrayList<ProductoRandomDTO> listaRandoms) {
		this.listaRandoms = listaRandoms;
	}

}
