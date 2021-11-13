package patternStrutturali.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NomiPersone {

	private ArrayList<String> persone;
	
	private static NomiPersone nomiPersone = null;
	
	private NomiPersone() {
		File file = new File(getClass().getResource("/patternStrutturali/resources/persone").getPath());

		persone = new ArrayList<String>();
		
		// prende la lista dei file
		for(var i : file.listFiles()) {
			
			String stringa = i.toString();
			
			// in questo modo, su qualsiasi pc, dovrebbe prenderlo perché prende dall'ultimo '/' in poi
			String[] diviso = stringa.split("/");
			
			stringa = diviso[diviso.length - 1];
			
			diviso = stringa.split("\\.");
			
			persone.add(diviso[0]);
			
		}
		
		// effettua un sor per averle ordinate
		Collections.sort(persone, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});

	}
	
	public ArrayList<String> getPersone() {
		return persone;
	}
	
	public static NomiPersone getNomiPersone() {
		if(nomiPersone == null)
			nomiPersone = new NomiPersone();
		return nomiPersone;
	}
	
}
