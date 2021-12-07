package chainOfResponsibility.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chainOfResponsibility.App;
import chainOfResponsibility.Documento;
import chainOfResponsibility.Stampante;
import chainOfResponsibility.StampanteBiancoNero;
import chainOfResponsibility.StampanteColori;

public class PannelloStampante extends JPanel {

	private static final long serialVersionUID = -1451727706912673674L;
	private JButton stampa;
	private JTextArea textArea;
	private JButton creaStampante;
	private JTextField formati;
	private JCheckBox colore;
	private JTextArea stampanti;
	private PannelloDocumento sx;

	public PannelloStampante(PannelloDocumento sx) {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		this.sx = sx;
		
		pannelloSopra();
		pannelloSotto();
	}

	private void pannelloSopra() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));
		
		formati = new JTextField();
		colore = new JCheckBox("A colori");
		creaStampante = new JButton("CreaStampante");
		stampanti = new JTextArea();
		stampanti.setEditable(false);
		stampanti.setMinimumSize(new Dimension(600, 600));
		creaStampante.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!formati.getText().equals("")) {
					Stampante s;
					if(colore.isSelected())
						s = new StampanteColori(Arrays.asList(formati.getText().split(",")));
					else
						s = new StampanteBiancoNero(Arrays.asList(formati.getText().split(",")));
					App.getApp().aggiungiStampante(s);
					stampanti.append(s.toString() + "\n");
				}
			}
		});
		

		p.add(formati);
		formati.setMaximumSize(new Dimension(1000, 30));
		p.add(colore);
		p.add(creaStampante);
		p.setMaximumSize(new Dimension(1000, 30));
		
		this.add(stampanti);
		this.add(p);

		
	}

	private void pannelloSotto() {
		// TODO Auto-generated method stub
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		stampa = new JButton("Stampa");
		
		stampa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i = 0; i < App.getApp().getDocumenti().size(); ++i) {
					String s = App.getApp().stampa(i) ? "Documento stampato " : "Documento non stampato "; 
					if(s.equals("Documento stampato ")) {
						App.getApp().getDocumenti().remove(i);
						sx.ristampaDocumenti();
					}
					textArea.append(s + i + "\n");
				}
				App.getApp().stampantiLibere();
			}
		});
		this.add(textArea);
		this.add(stampa);
	}
	
}
