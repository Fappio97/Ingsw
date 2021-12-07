package mediator;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Form implements Mediator {
	
	private ComboBox regione;
	private ComboBox provincia;
	private JTextArea text;
	
	public Form() {
		regione = new ComboBox(this);
		regione.nome = "Regione";
		provincia = new ComboBox(this);
		provincia.nome = "Provincia";
		text = new JTextArea();
		text.setEditable(false);
		
		regione.aggiungiDati(ListaDati.getListaDati().getRegioni());
		
		regione.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    riempiProvincia((String) regione.getSelectedItem());
 //                   provincia.setSelectedItem(null);
                }
            }
        });
	}
	
	public void riempiProvincia(String selected) {
		provincia.removeAllItems();
		for(int i = 0; i < ListaDati.getListaDati().getProvincePerRegione(selected).size(); ++i) 
			provincia.addItem(ListaDati.getListaDati().getProvincePerRegione(selected).get(i));
	}
	
	@Override
	public JPanel creaPannello() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.LINE_AXIS));
		p1.add(regione);
		p1.add(provincia);
		
		p.add(p1, BorderLayout.NORTH);
		p.add(text, BorderLayout.CENTER);
		return p;
	}
	

	@Override
	public void stampa(String string) {
		text.append(string);
	}

}
