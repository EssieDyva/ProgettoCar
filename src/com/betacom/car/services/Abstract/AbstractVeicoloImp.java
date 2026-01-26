package com.betacom.car.services.Abstract;

import java.util.HashMap;
import java.util.Map;

import com.betacom.car.exceptions.VeicoliException;
import com.betacom.car.models.Veicoli;
import com.betacom.car.services.interfaces.VeicoliInt;
import com.betacom.car.singleton.CarSingleton;

public abstract class AbstractVeicoloImp implements VeicoliInt {

    @Override
    public Veicoli execute(String[] lS) throws VeicoliException {
        
        System.out.println("Inizio veicoloAbs execute...");

        if (lS == null || lS.length < 2) {
            throw new VeicoliException("Input non valido o riga incompleta");
        }

        Map<String, String> mappa = new HashMap<>();
        for (Integer i = 2; i < lS.length; i++) {
            String[] elem = lS[i].split("=");
            if (elem.length == 2) {
                mappa.put(elem[0].trim(), elem[1].trim());
            }
        }

        try {
            Integer id = CarSingleton.getInstance().computeId();
            
            Veicoli v = creaVeicolo(
                id, 
                mappa.get("tipoVeicolo"), 
                mappa.get("numeroRuote") != null ? Integer.parseInt(mappa.get("numeroRuote")) : 0, 
                mappa.get("tipoAlimentazione"), 
                mappa.get("categoria"), 
                mappa.get("colore"), 
                mappa.get("marca"), 
                mappa.get("annoProduzione") != null ? Integer.parseInt(mappa.get("annoProduzione")) : 0, 
                mappa.get("modello"), 
                mappa
            );

            if (v != null) {
                return controlExecute(v, mappa); 
            } else {
                return null; 
            }

        } catch (NumberFormatException e) {
            throw new VeicoliException("Errore nel formato dei numeri (ruote o anno)");
        } catch (Exception e) {
            throw new VeicoliException(e.getMessage());
        }
    }

    protected Veicoli controlExecute(Veicoli vei, Map<String, String> params) throws Exception {

        try {
            vei.setNumeroRuote(Integer.parseInt(params.get("numeroRuote")));            
        } catch (Exception e) {
            throw new Exception("Numero ruote non valido o mancante");
        }
        
        if (!CarSingleton.getInstance().isValidValue("alim", params.get("tipoAlimentazione")))
            throw new Exception("Tipo alimentazione '" + params.get("tipoAlimentazione") + "' non valida");
        vei.setTipoAlimentazione(params.get("tipoAlimentazione"));
        
        if (!CarSingleton.getInstance().isValidValue("cat", params.get("categoria")))
            throw new Exception("Categoria '" + params.get("categoria") + "' non valida");
        vei.setCategoria(params.get("categoria"));

        if (!CarSingleton.getInstance().isValidValue("colore", params.get("colore")))
            throw new Exception("Colore '" + params.get("colore") + "' non valido");
        vei.setColore(params.get("colore"));

        if (!CarSingleton.getInstance().isValidValue("marca", params.get("marca")))
            throw new Exception("Marca '" + params.get("marca") + "' non valida");
        vei.setMarca(params.get("marca"));

        try {
            int anno = Integer.parseInt(params.get("annoProduzione"));
            if (anno < 2000 || anno > 2026) {
                throw new Exception("Anno " + anno + " fuori range consentito (2000-2026)");
            }
            vei.setAnnoProduzione(anno);
        } catch (NumberFormatException e) {
            throw new Exception("Anno produzione non numerico");
        }
        
        vei.setModello(params.get("modello"));
        
        return vei;
    }

    protected abstract Veicoli creaVeicolo(
        Integer id, String tipoVeicolo, Integer numeroRuote, 
        String tipoAlimentazione, String categoria, String colore, 
        String marca, Integer annoProduzione, String modello, 
        Map<String, String> mappa
    );
}