package com.betacom.car.models;

public class Macchina extends Veicoli{
	
	private Integer numeroPorte;		// 1 - n
	private String targa;			// univoca
	private Integer cc;				// 50, 100, 125, 150
	
	public Macchina() {}
	
	public Macchina(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, Integer numeroPorte, String targa, Integer cc) {
		super(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.numeroPorte = numeroPorte;
		this.targa = targa;
		this.cc = cc;
	}
	
	public Integer getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
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
		return "Macchina [numeroPorte=" + numeroPorte + ", targa=" + targa + ", cc=" + cc + ", getId()=" + getId()
				+ ", getTipoVeicolo()=" + getTipoVeicolo() + ", getNumeroRuote()=" + getNumeroRuote()
				+ ", getTipoAlimentazione()=" + getTipoAlimentazione() + ", getCategoria()=" + getCategoria()
				+ ", getColore()=" + getColore() + ", getMarca()=" + getMarca() + ", getAnnoProduzione()="
				+ getAnnoProduzione() + ", getModello()=" + getModello() + "]";
	}
	
	@Override
	public String generaStringaFiltro() {
	    return super.generaStringaFiltro() + 
	           ",numeroPorte=" + numeroPorte + 
	           ",targa=" + targa + 
	           ",cc=" + cc;
	}
}
