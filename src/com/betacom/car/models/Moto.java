package com.betacom.car.models;

public class Moto extends Veicoli{

	private String targa;		// deve essere univoco e più corto rispetto a quello per macchina
	private Integer cc;
	
	public Moto(Integer id,String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, String targa, Integer cc) {
		super(id,tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.targa = targa;
		this.cc = cc;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Moto [targa=" + targa + ", cc=" + cc + ", getId()=" + getId() + ", getTipoVeicolo()=" + getTipoVeicolo()
				+ ", getNumeroRuote()=" + getNumeroRuote() + ", getTipoAlimentazione()=" + getTipoAlimentazione()
				+ ", getCategoria()=" + getCategoria() + ", getColore()=" + getColore() + ", getMarca()=" + getMarca()
				+ ", getAnnoProduzione()=" + getAnnoProduzione() + ", getModello()=" + getModello() + "]";
	}	
	
	
}
