package bridge.view;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import bridge.controller.StampaControlli;
import bridge.model.App;
import bridge.model.Impostazioni;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = -2871478697544848792L;
	private JButton stampa;
	public JComboBox<String> colori;
	public JComboBox<String> figure;
	public boolean stampare;
	
	public MainPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		stampare = false;

		bottoneStampa();
		inizializzaColori();
		inizializzaFigure();
		this.add(stampa);
		stampa.addActionListener(new StampaControlli(this));
		stampa.setBounds(Impostazioni.DIMENSIONE_SCHERMO_1 - 100, 20, 60, 60);
		this.add(colori);
		colori.setBounds(Impostazioni.DIMENSIONE_SCHERMO_1 - 300, 20, 100, 60);
		this.add(figure);
		figure.setBounds(Impostazioni.DIMENSIONE_SCHERMO_1 - 600, 20, 200, 60);
	}

	
	private void inizializzaFigure() {
		figure = new JComboBox<String>();
		figure.addItem((String) App.getApp().getFigure().get("Quadrato").nome);
		figure.addItem(App.getApp().getFigure().get("Rettangolo").nome);
	}


	private void inizializzaColori() {
		colori = new JComboBox<String>();
		colori.addItem(App.getApp().getColori().get(0).getNome());
		colori.addItem(App.getApp().getColori().get(1).getNome());
	}


	private void bottoneStampa() {
		
		try {
			Image img = ImageIO.read(getClass().getResource("/bridge/resources/stampa.png"));
			
			img.getScaledInstance(Impostazioni.DIM_ICONA_STAMPA, Impostazioni.DIM_ICONA_STAMPA, Image.SCALE_SMOOTH);
			
			stampa = new JButton(new ImageIcon(img));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(stampare)
			g.drawImage(ImmaginiView.getIstance().img.get(App.getApp().attualeFigura), Impostazioni.POS_X, Impostazioni.POS_Y, null);
	}

}
