package patternStrutturali;

import javax.swing.JFrame;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class Applicazione {
	
	private App app;
	private MainPanel p;
	
	public Applicazione() {

		app = new App();
		p = new MainPanel(app);

	}
	
	public void avvia() {
		JFrame f = new JFrame("Facade");
		f.setSize(Impostazioni.DIMENSIONE_SCHERMO_1, Impostazioni.DIMENSIONE_SCHERMO_2);
		f.setResizable(false);
		
		p.setFocusable(true);
		f.add(p);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
