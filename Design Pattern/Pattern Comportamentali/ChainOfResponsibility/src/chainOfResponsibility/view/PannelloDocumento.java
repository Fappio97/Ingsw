package chainOfResponsibility.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chainOfResponsibility.App;
import chainOfResponsibility.Documento;

public class PannelloDocumento extends JPanel {
	
	private static final long serialVersionUID = -1451727706912673674L;
	private JButton creaDocumento;
	private JComboBox<String> formato;
	private JCheckBox colori;
	private JTextArea textArea;

	public PannelloDocumento() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setSize(200, 200);
		this.add(textArea);
		
		pannelloCreazioenDocumento();
	}

	private void pannelloCreazioenDocumento() {
		colori = new JCheckBox("Colorato");
		formato = new JComboBox<String>();
		formato.addItem("a3");
		formato.addItem("a4");
		formato.addItem("a5");
		creaDocumento = new JButton("Crea");
		
		creaDocumento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					App.getApp().getDocumenti().add(new Documento(colori.isSelected(), (String) formato.getSelectedItem()));
					textArea.append(App.getApp().getDocumenti().size() - 1 + " " + App.getApp().getDocumenti().get(App.getApp().getDocumenti().size() - 1).toString() + "\n");
			}
		});
		
		JPanel p = new JPanel();
		p.setSize(10, 100);
		p.setMaximumSize(new Dimension(1000, 100));
		p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));
		p.add(formato);
		p.add(colori);
		this.add(p);
		
		this.add(creaDocumento);
		
	}

	public void ristampaDocumenti() {
		textArea.setText("");
		for(var i : App.getApp().getDocumenti()) 
			textArea.append(i + "\n");
	}
}
