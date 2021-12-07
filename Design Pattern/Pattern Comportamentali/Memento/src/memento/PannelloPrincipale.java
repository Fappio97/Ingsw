package memento;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PannelloPrincipale extends JPanel {

	private static final long serialVersionUID = -766990876237558641L;
	
	public PannelloPrincipale() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(new PannelloSuperiore());
		this.add(Testo.getTesto());
	}
	
}
