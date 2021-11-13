package patternStrutturali.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class FrecciaPersona2SXController implements ActionListener {

	private App app;
	private MainPanel mainPanel;
	
	public FrecciaPersona2SXController(MainPanel mainPanel, App a) {
		this.mainPanel = mainPanel;
		this.app = a;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		do {
			if(app.indexPersona2 <= 0)
				app.indexPersona2 = app.persone.size() - 1;
			else
				app.indexPersona2 -= 1;
		} while(app.indexPersona2 == app.indexPersona1);
		mainPanel.repaint();
	}


}
