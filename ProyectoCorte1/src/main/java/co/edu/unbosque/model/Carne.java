package co.edu.unbosque.model;

public abstract class Carne {

	protected String animalOrigen;

	public Carne() {
		super();
	}

	public Carne(String animalOrigen) {
		super();
		this.animalOrigen = animalOrigen;
	}

	public String getAnimalOrigen() {
		return animalOrigen;
	}

	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}

	@Override
	public String toString() {
		return "Carne [animalOrigen=" + animalOrigen + "]";
	}

}
