package proxy;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pannello extends JPanel {

	private static final long serialVersionUID = 1039921948309464749L;
	private JButton carica;
	private JButton play;
	private JButton restart;
	private JButton stop;
	private JComboBox<String> audio;
	private JTextArea console;
	private InterfacciaLettoreAudio interfacciaLettoreAudio;
	
	public Pannello() {
		interfacciaLettoreAudio = new InterfacciaLettoreAudio();
		
		this.setLayout(new BorderLayout());
		
		creaPannelloSopra();
		creaPannelloSotto();
		
		console = Display.getDisplay();
		this.add(console, BorderLayout.CENTER);
	}

	private void creaPannelloSotto() {
		JPanel sotto = new JPanel();
		try {
			stop = new JButton(new ImageIcon(ImageIO.read(getClass().getResource("/proxy/resources/stop.png")).getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
			restart = new JButton(new ImageIcon(ImageIO.read(getClass().getResource("/proxy/resources/restart.png")).getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
			play = new JButton(new ImageIcon(ImageIO.read(getClass().getResource("/proxy/resources/play.png")).getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sotto.add(play);
		play.setEnabled(false);
		
		play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				interfacciaLettoreAudio.avvia();
				play.setEnabled(false);
				stop.setEnabled(true);
				restart.setEnabled(true);
			}
		});
		
		
		sotto.add(stop);
		stop.setEnabled(false);
		
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				interfacciaLettoreAudio.stop();
				stop.setEnabled(false);
				play.setEnabled(true);
			}
		});
		
		sotto.add(restart);
		restart.setEnabled(false);
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				interfacciaLettoreAudio.restart();
			}
		});
		
		
		this.add(sotto, BorderLayout.SOUTH);
	}

	private void creaPannelloSopra() {
		JPanel sopra = new JPanel();
		try {
			
			audio = new JComboBox<String>();
			for(var i : NomiMusiche.getNomiMusiche().getLista()) {
				audio.addItem(i);
			}
			
			
			carica = new JButton(new ImageIcon(ImageIO.read(getClass().getResource("/proxy/resources/load.png")).getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		
			carica.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String nomeAudio = (String) audio.getSelectedItem();
					interfacciaLettoreAudio.stop();
					interfacciaLettoreAudio.impostaDaCapo();
					interfacciaLettoreAudio.carica(nomeAudio);
					play.setEnabled(true);
					restart.setEnabled(false);
					stop.setEnabled(false);
				}
			});
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		sopra.setLayout(new BoxLayout(sopra, BoxLayout.LINE_AXIS));
		sopra.add(audio);
		sopra.add(carica);
		this.add(sopra, BorderLayout.NORTH);
	}

}
