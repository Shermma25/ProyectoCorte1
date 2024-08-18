package co.edu.unbosque.model;

import java.util.Random;

public class ProductoFrutaDTO extends VegetalYFruta {

	private int UID, numLote, numUnidades;
	private String nombreP, empresa, fechaVen;

	public ProductoFrutaDTO() {
		super();
	}

	public ProductoFrutaDTO(int uID, int numLote, int numUnidades, String nombreP, String empresa, String fechaVen,
			String fechaCosecha, boolean organico) {
		super(organico, fechaCosecha);
		UID = uID;
		this.numLote = randomNum();
		this.numUnidades = numUnidades;
		this.nombreP = nombreP;
		this.empresa = empresa;
		this.fechaVen = fechaVen;
	}

	private int randomNum() {
		Random random = new Random();
		return random.nextInt(9000) + 1000;
	}

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public int getNumLote() {
		return numLote;
	}

//	public void setNumLote(int numLote) {
//		this.numLote = numLote;
//	}

	public int getNumUnidades() {
		return numUnidades;
	}

	public void setNumUnidades(int numUnidades) {
		this.numUnidades = numUnidades;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFechaVen() {
		return fechaVen;
	}

	public void setFechaVen(String fechaVen) {
		this.fechaVen = fechaVen;
	}

	@Override
	public String toString() {
		return "ProductoFrutaDTO [UID=" + UID + ", numLote=" + numLote + ", numUnidades=" + numUnidades + ", nombreP="
				+ nombreP + ", empresa=" + empresa + ", fechaVen=" + fechaVen + "]";
	}

}