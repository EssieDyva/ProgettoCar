package com.betacom.car.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.betacom.car.models.Veicoli;

public class FileProcess {

	public List<String> readFile(String path) {
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

	public void writeFile(String path, Map<Integer, Veicoli> mappaVei) {
		File f = new File(path);
		if (f.exists()) {
			System.out.println("File " + path + " exists");
			f.delete();
		}

		FileWriter o = null;

		try {
			o = new FileWriter(f);

			for (Entry<Integer, Veicoli> it : mappaVei.entrySet()) {
				o.write("Stampa con filtro -- key: " + it.getKey() + " value: " + it.getValue().toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}