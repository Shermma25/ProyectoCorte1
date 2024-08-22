package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProductoCarneDTO;

public class ProductoCarneDAO implements CRUDOperation<ProductoCarneDTO> {

	private ArrayList<ProductoCarneDTO> listaCarnesFrias;

	public ProductoCarneDAO() {
		listaCarnesFrias = new ArrayList<ProductoCarneDTO>();

	}

	@Override
	public void crear(ProductoCarneDTO nuevo) {
		listaCarnesFrias.add(nuevo);

	}

	@Override
	public int eliminar(ProductoCarneDTO dato) {
		if (listaCarnesFrias.remove(dato)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int eliminar(int index) {
		if (listaCarnesFrias.remove(index) != null) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<ProductoCarneDTO> mostrar() {
		return new ArrayList<>(listaCarnesFrias);
	}

	@Override
	public int cantidad() {
		return listaCarnesFrias.size();
	}

	public int actualizar(int UID, ProductoCarneDTO nuevoDato) {
		for (int i = 0; i < listaCarnesFrias.size(); i++) {
			if (listaCarnesFrias.get(i).getUID() == UID) {
				listaCarnesFrias.set(i, nuevoDato);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<ProductoCarneDTO> getListaCarnesFrias() {
		return listaCarnesFrias;
	}

	public void setListaCarnesFrias(ArrayList<ProductoCarneDTO> listaCarnesFrias) {
		this.listaCarnesFrias = listaCarnesFrias;
	}
	
	

}
