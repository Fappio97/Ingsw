package patternStrutturali.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class FrecciaPersona1DXController implements ActionListener {

	private App app;
	private MainPanel mainPanel;
	
	public FrecciaPersona1DXController(MainPanel mainPanel, App a) {
		this.mainPanel = mainPanel;
		this.app = a;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		do {
			if(app.indexPersona1 >= app.persone.size() - 1)
				app.indexPersona1 = 0;
			else
				app.indexPersona1 += 1;
		} while(app.indexPersona2 == app.indexPersona1);
		mainPanel.repaint();
	}

}
