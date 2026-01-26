package com.betacom.car.models;

public class Bici extends Veicoli{
	private Integer numeroMarce;
	private String tipoFreno;		// tamburo, disco, pattino
	private String tipoSospensione;	// senza, mono, bi
	private Boolean isPiegevole;
	
	public Bici() {
		super();
	}
	
	public Bici(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, Integer numeroMarce, String tipoFreno, String tipoSospensione, Boolean isPiegevole) {
		super(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.numeroMarce = numeroMarce;
		this.tipoFreno = tipoFreno;
		this.tipoSospensione = tipoSospensione;
		this.isPiegevole = isPiegevole;
	}

	public Integer getNumeroMarce() {
		return numeroMarce;
	}

	public void setNumeroMarce(Integer numeroMarce) {
		this.numeroMarce = numeroMarce;
	}

	public String getTipoFreno() {
		return tipoFreno;
	}

	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}

	public String getTipoSospensione() {
		return tipoSospensione;
	}

	public void setTipoSospensione(String tipoSospensione) {
		this.tipoSospensione = tipoSospensione;
	}

	public Boolean getIsPiegevole() {
		return isPiegevole;
	}

	public void setIsPiegevole(Boolean isPiegevole) {
		this.isPiegevole = isPiegevole;
	}

	@Override
	public String toString() {
		return "Bici [numeroMarce=" + numeroMarce + ", tipoFreno=" + tipoFreno + ", tipoSospensione=" + tipoSospensione
				+ ", isPiegevole=" + isPiegevole + ", getId()=" + getId() + ", getNumeroRuote()=" + getNumeroRuote()
				+ ", getTipoAlimentazione()=" + getTipoAlimentazione() + ", getCategoria()=" + getCategoria()
				+ ", getColore()=" + getColore() + ", getMarca()=" + getMarca() + ", getAnnoProduzione()="
				+ getAnnoProduzione() + ", getModello()=" + getModello() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	


}
