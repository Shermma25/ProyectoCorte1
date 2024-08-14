package co.edu.unbosque.model;

public abstract class Juguete {

	protected int numJugadores, edadMinima;

	public Juguete() {
		super();
	}

	public Juguete(int numJugadores, int edadMinima) {
		super();
		this.numJugadores = numJugadores;
		this.edadMinima = edadMinima;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	@Override
	public String toString() {
		return "Juguete [numJugadores=" + numJugadores + ", edadMinima=" + edadMinima + "]";
	}

}
