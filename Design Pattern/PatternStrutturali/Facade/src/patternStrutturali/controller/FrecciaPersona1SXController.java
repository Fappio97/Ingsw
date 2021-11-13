package patternStrutturali.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class FrecciaPersona1SXController implements ActionListener {

	private App app;
	private MainPanel mainPanel;
	
	public FrecciaPersona1SXController(MainPanel mainPanel, App a) {
		this.mainPanel = mainPanel;
		this.app = a;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		do {
			if(app.indexPersona1 <= 0)
				app.indexPersona1 = app.persone.size() - 1;
			else
				app.indexPersona1 -= 1;
		} while(app.indexPersona2 == app.indexPersona1);
		mainPanel.repaint();
	}

}
