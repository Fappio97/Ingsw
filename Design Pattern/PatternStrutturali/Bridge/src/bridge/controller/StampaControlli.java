package bridge.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bridge.model.App;
import bridge.view.MainPanel;

public class StampaControlli implements ActionListener{

	private MainPanel mainPanel;
	
	public StampaControlli(MainPanel m) {
		mainPanel = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String colore = (String) mainPanel.colori.getSelectedItem();

		String figura = (String) mainPanel.figure.getSelectedItem();
		figura = figura.toLowerCase();
		App.getApp().attualeFigura = figura + " " + colore;
		mainPanel.stampare = true;
		mainPanel.repaint();
	}
	
}
