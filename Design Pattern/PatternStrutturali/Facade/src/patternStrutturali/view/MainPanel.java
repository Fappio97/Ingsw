package patternStrutturali.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

import patternStrutturali.Impostazioni;
import patternStrutturali.controller.FrecciaDXController;
import patternStrutturali.controller.FrecciaPersona1DXController;
import patternStrutturali.controller.FrecciaPersona1SXController;
import patternStrutturali.controller.FrecciaPersona2DXController;
import patternStrutturali.controller.FrecciaPersona2SXController;
import patternStrutturali.controller.FrecciaSXController;
import patternStrutturali.model.App;
import patternStrutturali.model.NomiCampi;
import patternStrutturali.model.NomiPersone;

public class MainPanel extends JPanel{

	private static final long serialVersionUID = -2871478697544848792L;
	private JButton campoDX;
	private JButton campoSX;
	
	private JButton persona1SX;
	private JButton persona1DX;
	private JButton persona2SX;
	private JButton persona2DX;
	
	private App app;
	
	public MainPanel(App a) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		app = a;
		
		bottoniCampi();
		bottoniPersone();
		
		this.add(campoDX);
		this.add(campoSX);
		this.add(persona1DX);
		this.add(persona1SX);
		this.add(persona2SX);
		this.add(persona2DX);
	}
	
	private void bottoniPersone() {
		persona1SX = new JButton(FrecceView.getIstance().getImmagine(0));
		persona1DX = new JButton(FrecceView.getIstance().getImmagine(1));
		persona2SX = new JButton(FrecceView.getIstance().getImmagine(0));
		persona2DX = new JButton(FrecceView.getIstance().getImmagine(1));
		
		persona1SX.addActionListener(new FrecciaPersona1SXController(this, app));
		persona1DX.addActionListener(new FrecciaPersona1DXController(this, app));
		persona2SX.addActionListener(new FrecciaPersona2SXController(this, app));
		persona2DX.addActionListener(new FrecciaPersona2DXController(this, app));
				
		persona1SX.setBounds(Impostazioni.POS_FRECCIA_PERSONA_1_X, Impostazioni.POS_FRECCIA_PERSONA_Y, Impostazioni.DIM_FRECCE_PERSONA, Impostazioni.DIM_FRECCE_PERSONA);
		persona1DX.setBounds(Impostazioni.POS_FRECCIA_PERSONA_1_X1, Impostazioni.POS_FRECCIA_PERSONA_Y, Impostazioni.DIM_FRECCE_PERSONA, Impostazioni.DIM_FRECCE_PERSONA);
		persona2SX.setBounds(Impostazioni.POS_FRECCIA_PERSONA_2_X, Impostazioni.POS_FRECCIA_PERSONA_Y, Impostazioni.DIM_FRECCE_PERSONA, Impostazioni.DIM_FRECCE_PERSONA);
		persona2DX.setBounds(Impostazioni.POS_FRECCIA_PERSONA_2_X1, Impostazioni.POS_FRECCIA_PERSONA_Y, Impostazioni.DIM_FRECCE_PERSONA, Impostazioni.DIM_FRECCE_PERSONA);

	}

	private void bottoniCampi() {
		campoDX = new JButton(FrecceView.getIstance().getImmagine(1));
		campoSX = new JButton(FrecceView.getIstance().getImmagine(0));
		campoDX.addActionListener(new FrecciaDXController(this, app));
		campoSX.addActionListener(new FrecciaSXController(this, app));
		campoSX.setBounds(Impostazioni.POS_FRECCIA_CAMPO_X, Impostazioni.POS_FRECCIA_CAMPO_Y, Impostazioni.DIM_FRECCE, Impostazioni.DIM_FRECCE);
		campoDX.setBounds(Impostazioni.POS_FRECCIA_CAMPO_X1, Impostazioni.POS_FRECCIA_CAMPO_Y, Impostazioni.DIM_FRECCE, Impostazioni.DIM_FRECCE);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		stampaCampo(g);
		stampaPersona1(g);
		stampaPersona2(g);
	}
	

	private void stampaPersona1(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
		g.drawImage(PersonaView.getIstance().getImmagine(app.indexPersona1), Impostazioni.POS_PERSONA_X_1, Impostazioni.POS_PERSONA_Y, Impostazioni.DIM_PERSONA, Impostazioni.DIM_PERSONA, null);
		g.drawString(NomiPersone.getNomiPersone().getPersone().get(app.indexPersona1), Impostazioni.POS_PERSONA_X_1 + 5, Impostazioni.POS_PERSONA_Y + 10);
	}
	
	private void stampaPersona2(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
		g.drawImage(PersonaView.getIstance().getImmagine(app.indexPersona2), Impostazioni.POS_PERSONA_X_2, Impostazioni.POS_PERSONA_Y, Impostazioni.DIM_PERSONA, Impostazioni.DIM_PERSONA, null);
		g.drawString(NomiPersone.getNomiPersone().getPersone().get(app.indexPersona2), Impostazioni.POS_PERSONA_X_2 + 5, Impostazioni.POS_PERSONA_Y + 10);
	}

	private void stampaCampo(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g.drawString(NomiCampi.getNomiCampi().getCampi().get(app.indexCampi), getWidth() / 2 - ((NomiCampi.getNomiCampi().getCampi().get(app.indexCampi).length() * 15) / 2), 50);
		g.drawImage(CampoView.getIstance().getImmagine(app.indexCampi), Impostazioni.POS_CAMPO_X, Impostazioni.POS_CAMPO_Y, Impostazioni.DIM_CAMPO_1, Impostazioni.DIM_CAMPO_2, null);
	}
}
