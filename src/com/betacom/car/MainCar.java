package com.betacom.car;
import java.util.ArrayList;
import java.util.List;

import com.betacom.car.process.StartCar;

public class MainCar {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		//eventuali parametri dentro una liste
		
		List<String> params = new ArrayList<String>();
		
		System.out.println("inizio");
		
		params.add("add,macchina,tipoVeicolo=macchina,numeroRuote=4,tipoAlimentazione=benzina,categoria=strada,colore=bianco,marca=fiat,annoProduzione=2000,modello=500,numeroPorte=5,targa=hdges,cc=125");
		//params.add("add,macchina,tipoVeicolo=macchina,numeroRuote=3,tipoAlimentazione=benz,categoria=str,colore=bia,marca=fi,annoProduzione=199,modello=50,numeroPorte=2,targa=hdge,cc=12");
		//params.add("add,macchina,tipoVeicolo=macchina,numeroRuote=4,tipoAlimentazione=benzina,categoria=strada,colore=bianco,marca=fiat,annoProduzione=1999,modello=500,numeroPorte=5,targa=hdges,cc=125");
		//params.add("add,macchina,tipoVeicolo=macchina,numeroRuote=3,tipoAlimentazione=benz,categoria=str,colore=bia,marca=fi,annoProduzione=199,modello=50,numeroPorte=2,targa=prjfc,cc=12");
		//params.add("add,moto,tipoVeicolo=moto,numeroRuote=2,tipoAlimentazione=benz,categoria=strada,colore=rosso,marca=honda,annoProduzione=2010,modello=kkkk,targa=JHSGDFJ,cc=200");
		//params.add("add,bici,tipoVeicolo=moto,numeroRuote=2,tipoAlimentazione=elet,categoria=strada,colore=blu,marca=bianchi,annoProduzione=1999,modello=boh,numeroMarce=6,tipoFreno=pneu,tipoSospensione=molle,pieghevole=TRUE");
		
		StartCar engine= new StartCar();
		engine.execute(params);
		/*
		 * tipo di input format.
		 * add,macchina,marca=fiat,modello=panda,cat=cita,colore=bianca..... 
		 * add,moto,marca=Yamaha,modello=R1,cat=strada,colore=rossa..... 
		 * add,bici......
		 * ...
		 * ...
		 * list 
		 * list macchina/moto/bici 
		 * process: -control dei parametri  --- In caso di error fare un sysout con l'errore
		 * 			-se il controllo va bene carcare l'oggetto dentro una List<Veicoli> commune per tutti veicoli
		 * 
		 * la lista: prevedere un filtro per tipo veicoli
		 * 
		 * 
		 */
		
		//commento Git 18:31 test
		
	}

}
