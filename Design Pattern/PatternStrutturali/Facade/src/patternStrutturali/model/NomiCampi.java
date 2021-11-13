package patternStrutturali.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class NomiCampi {
	
	private ArrayList<String> campi;
	
	private static NomiCampi nomiCampi = null;
	
	private NomiCampi() {
		File file = new File(getClass().getResource("/patternStrutturali/resources/campo").getPath());

		campi = new ArrayList<String>();
		
		// prende la lista dei file
		for(var i : file.listFiles()) {
			
			String stringa = i.toString();
			
			// in questo modo, su qualsiasi pc, dovrebbe prenderlo perché prende dall'ultimo '/' in poi
			String[] diviso = stringa.split("/");
			
			stringa = diviso[diviso.length - 1];
			
			diviso = stringa.split("\\.");
			
			campi.add(diviso[0]);
			
		}
		
		// effettua un sor per averle ordinate
		Collections.sort(campi, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});

	}
	
	public ArrayList<String> getCampi() {
		return campi;
	}
	
	public static NomiCampi getNomiCampi() {
		if(nomiCampi == null)
			nomiCampi = new NomiCampi();
		return nomiCampi;
	}

}
