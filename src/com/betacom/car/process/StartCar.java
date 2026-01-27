package com.betacom.car.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.betacom.car.exceptions.VeicoliException;
import com.betacom.car.models.Veicoli;
import com.betacom.car.services.implementation.BiciImplementation;
import com.betacom.car.services.implementation.MacchinaImplementation;
import com.betacom.car.services.implementation.MotoImplementation;
import com.betacom.car.services.interfaces.VeicoliInt;

public class StartCar {
	
	public void execute(String path) throws Exception{
		
		System.out.println("inizio startcar");
		
		List<String> params = new ArrayList<String>();
		Map<String, VeicoliInt> mappaImp = new HashMap<String, VeicoliInt>();
		Map<Integer, Veicoli> mappaVei=new HashMap<Integer, Veicoli>();
		mappaImp.put("macchina", new MacchinaImplementation());
		mappaImp.put("moto", new MotoImplementation());
		mappaImp.put("bici", new BiciImplementation());
		
		params=readFile(path);
		
		for(String riga:params) {
			
			String[]elementi=riga.split(",");
			Veicoli v=null;
			
			if (mappaImp.containsKey(elementi[1])) {
				try {
					VeicoliInt ex = mappaImp.get(elementi[1]);
					v=ex.execute(elementi);
					
					if(v != null) {
						System.out.println("Test " + v.toString());
						mappaVei.put(v.getId(), v);
					}
				} catch (VeicoliException e) {
					System.out.println("Errore applicativo:" + e.getMessage());
					
				} catch (Exception e) {
					System.out.println("Abnomal end:" + e.getMessage());
					e.printStackTrace();
			}
				
			} else {
				System.out.println("veicolo non previsto");
			}
			
			try {
				if (v != null) {
					System.out.println(v.toString());
					mappaVei.put(v.getId(), v);}
				else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Errore in startCar");
			}
		}
		
		String filtro="macchina";
		stampa(filtro, mappaVei);
	}
	
	private List<String> readFile(String path) {
		List<String> r = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			while (line != null) {
				r.add(line);
				line = reader.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public void stampa(String filtro, Map<Integer, Veicoli> mappaVei) {
		for (Entry<Integer, Veicoli> it:mappaVei.entrySet()) {
			if(it.getValue().getTipoVeicolo().equalsIgnoreCase(filtro))
            System.out.println("Stampa con filtro -- key: " + it.getKey() + " value: " + it.getValue().toString());
        }
	}
}
