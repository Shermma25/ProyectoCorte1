package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation<T> {

	public void crear(T nuevo);

	public int eliminar(T dato);

	public int eliminar(int index);

	public ArrayList<T> mostrar();

	public int cantidad();

	public int actualizar(int index, T nuevoDato);

}
