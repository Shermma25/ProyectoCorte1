package co.edu.unbosque.model;

public abstract class VegetalYFruta {

	protected boolean organico;
	protected String fechaCosecha;

	public VegetalYFruta() {
		super();
	}

	public VegetalYFruta(boolean organico, String fechaCosecha) {
		super();
		this.organico = organico;
		this.fechaCosecha = fechaCosecha;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getFechaCosecha() {
		return fechaCosecha;
	}

	public void setFechaCosecha(String fechaCosecha) {
		this.fechaCosecha = fechaCosecha;
	}

	@Override
	public String toString() {
		return "Vegetal [Organico=" + organico + ", fechaCosecha=" + fechaCosecha + "]";
	}

}
