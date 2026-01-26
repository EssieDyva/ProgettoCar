package com.betacom.car.services.implementation;

import java.util.Map;

import com.betacom.car.models.Moto;
import com.betacom.car.models.Veicoli;
import com.betacom.car.services.Abstract.AbstractVeicoloImp;
import com.betacom.car.singleton.CarSingleton;

public class MotoImplementation extends AbstractVeicoloImp{

	 @Override
	    protected Veicoli creaVeicolo(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria, String colore, String marca, Integer annoProduzione, String modello, Map<String, String> mappa) {
	    	
	    	System.out.println("inizio crea veicolo moto");
	        String targa = mappa.get("targa");
			Boolean checkTarga = CarSingleton.getInstance().checkLoadTarga(targa);
			Integer cc=Integer.parseInt(mappa.get("cc"));
			
			if (checkTarga && numeroRuote>1 && numeroRuote<4) 
				return new Moto(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello, targa, cc);
			else 
				return null;
	    }

}
