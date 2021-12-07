package memento.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import memento.Testo;


public class SalvaFile implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
	    	BufferedWriter scrivi = new BufferedWriter(new FileWriter("text.txt"));
	        scrivi.write("");
	        
	        scrivi.append(Testo.getTesto().getParola());
	    
	        scrivi.close();
	    } catch (IOException e1) {
	    	System.out.println("Errore nel salvataggio del file");
	    }
	}
}
