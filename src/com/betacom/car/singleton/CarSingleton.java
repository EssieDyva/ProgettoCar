package com.betacom.car.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.betacom.car.exceptions.VeicoliException;

public class CarSingleton {

	private static CarSingleton instance = null;

	private Set<String> setTarghe = new HashSet<String>();
	
	Map<String, String[]> controlli = new HashMap<String, String[]>();
	
	private Integer id = 0;
	private CarSingleton() {
		loadConstant();
	}

	public static CarSingleton getInstance() {
		if (instance == null) {
			instance = new CarSingleton();
		}
		return instance;
	}
	
	public Integer computeId() {
		return ++id;
	}

	public Boolean checkLoadTarga(String targa) {
		try {
			if (!setTarghe.contains(targa)) {
				setTarghe.add(targa);
				return true;				
			}
			else {
				throw new VeicoliException();
			}
		}
		catch (VeicoliException e) {
			System.out.println("Targa uguale" + e.getMessage());
			return false;
		}
	}
	
	public void loadConstant() {
		List<String> cons = new ArrayList<String>();
		cons.add("alim=benzina,diesel,elettrica,ibrida,manuale");
		cons.add("cat=strada,fuoristrada,suv,mtb,cross");
		cons.add("colore=bianco,nero,verde,giallo,marrone,rosso");
		cons.add("marca=Fiat,Renault,BMW,Tesla,Bianchi,Yamaha,Mercedes,Tecnizer");
		cons.add("sospensione=senza,mono,");
		
		for (String it:cons) {
			String [] el = it.split("=");
			String [] elP = el[1].split(",");
			controlli.put(el[0], elP);			
		}
	}
	
	public boolean isValidValue(String key, String value) {
		String[] values = controlli.get(key);
		boolean ret = false;
		for (String it:values) {
			if (value.equalsIgnoreCase(it)) {
				ret = true;
				break;
			}			
		}
		return ret;
	}
}
