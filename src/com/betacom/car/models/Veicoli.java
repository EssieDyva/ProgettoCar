package com.betacom.car.models;

public class Veicoli {
	private Integer id; 					// id univoco del record
	private String tipoVeicolo;
	private Integer numeroRuote; 		// 1-4 dipende del tipo veicolo
	private String tipoAlimentazione; 	// benzina, diesel, elettrica, ibrida
	private String categoria;			// strada, fuori strada, suv, città, sportiva
	private String colore;				// qualsiasi colore
	private String marca;				// fiat, ford, lancia, renault, yamaha, bianchi, ecc...
	private Integer annoProduzione;
	private String modello;				// fiat 500, lancia ypsilon, renault renegade, ecc...
	
	public Veicoli() {}
	
	public Veicoli(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello) {
		super();
		this.id = id;
		this.tipoVeicolo = tipoVeicolo;
		this.numeroRuote = numeroRuote;
		this.tipoAlimentazione = tipoAlimentazione;
		this.categoria = categoria;
		this.colore = colore;
		this.marca = marca;
		this.annoProduzione = annoProduzione;
		this.modello = modello;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoVeicolo() {
		return tipoVeicolo;
	}

	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	public Integer getNumeroRuote() {
		return numeroRuote;
	}

	public void setNumeroRuote(Integer numeroRuote) {
		this.numeroRuote = numeroRuote;
	}

	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(Integer annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
}
