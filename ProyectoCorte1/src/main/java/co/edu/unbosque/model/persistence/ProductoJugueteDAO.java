package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoJugueteDTO;

public class ProductoJugueteDAO implements CRUDOperation<ProductoJugueteDTO> {

	private ArrayList<ProductoJugueteDTO> listaJuguetes;

	public ProductoJugueteDAO() {
		listaJuguetes = new ArrayList<ProductoJugueteDTO>();

	}

	@Override
	public void crear(ProductoJugueteDTO nuevo) {
		listaJuguetes.add(nuevo);

	}

	@Override
	public int eliminar(ProductoJugueteDTO dato) {
		if (listaJuguetes.remove(dato)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int eliminar(int index) {
		if (listaJuguetes.remove(index) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<ProductoJugueteDTO> mostrar() {
		return new ArrayList<>(listaJuguetes);
	}

	@Override
	public int cantidad() {
		return listaJuguetes.size();
	}

	public int actualizar(int UID, ProductoJugueteDTO nuevoDato) {
		for (int i = 0; i < listaJuguetes.size(); i++) {
			if (listaJuguetes.get(i).getUID() == UID) {
				listaJuguetes.set(i, nuevoDato);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<ProductoJugueteDTO> getListaJuguetes() {
		return listaJuguetes;
	}

	public void setListaJuguetes(ArrayList<ProductoJugueteDTO> listaJuguetes) {
		this.listaJuguetes = listaJuguetes;
	}

}
