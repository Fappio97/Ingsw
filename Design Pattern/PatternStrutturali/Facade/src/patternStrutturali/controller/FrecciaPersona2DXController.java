package patternStrutturali.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class FrecciaPersona2DXController implements ActionListener {

	private App app;
	private MainPanel mainPanel;
	
	public FrecciaPersona2DXController(MainPanel mainPanel, App a) {
		this.mainPanel = mainPanel;
		this.app = a;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		do {
			if(app.indexPersona2 >= app.persone.size() - 1)
				app.indexPersona2 = 0;
			else
				app.indexPersona2 += 1;
		} while(app.indexPersona2 == app.indexPersona1);
		mainPanel.repaint();
	}
}
