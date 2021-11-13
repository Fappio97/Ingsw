package patternStrutturali.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import patternStrutturali.model.App;
import patternStrutturali.view.MainPanel;

public class FrecciaSXController implements ActionListener {

	private App app;
	private MainPanel mainPanel;
	
	public FrecciaSXController(MainPanel mainPanel, App a) {
		this.mainPanel = mainPanel;
		this.app = a;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(app.indexCampi <= 0)
			app.indexCampi = (app.campi.size() - 1);
		else
			app.indexCampi -= 1;
		mainPanel.repaint();
	}

}
