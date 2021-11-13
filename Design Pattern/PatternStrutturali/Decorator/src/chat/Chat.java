package chat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Chat extends JPanel {
	
	private static final long serialVersionUID = 4213060829881951932L;

	private void handleMessage(JTextArea message, JTextArea allMessages) {
		allMessages.append(ControllaFrase(message.getText().split("\\.|,|;| ")) + System.lineSeparator());
		message.setText("");	
	}
	
	private String ControllaFrase(String[] string) {
		// TODO Auto-generated method stub
		String a = "";
		DecoratoreOffensivo decOff;
		DecoratorePersonalizzato decPers;
		for(int i = 0; i < string.length; ++i) {
			if(ParoleProibite.getParoleProibite().getProibite().contains(string[i])) {
				decOff = new DecoratoreOffensivo(new ParolaConcreta(string[i]));
				a += decOff.stampa();
			} else if(ParolePersonalizzate.getParolePersonalizzate().getPersonalizzate().contains(string[i])) {
				decPers = new DecoratorePersonalizzato(new ParolaConcreta(string[i]));
				a += decPers.stampa();
			}
				
			else
				a += string[i];
			a += " ";
		}
		return a;
	}

	public Chat() {

		this.setLayout(new BorderLayout());
		
		JTextArea allMessages = new JTextArea();
		allMessages.setEditable(false);
		JScrollPane scrollAllMessages = new JScrollPane(allMessages);
		this.add(scrollAllMessages, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		south.setLayout(new BoxLayout(south, BoxLayout.LINE_AXIS));
		JTextArea message = new JTextArea();
		message.setLineWrap(true); //scorrimento solo verticale
		JScrollPane scrollMessages = new JScrollPane(message);
		JButton send = new JButton("send");
		south.setPreferredSize(new Dimension(550, 100));
		south.add(scrollMessages);
		south.add(send);
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		//		message = controllaParola(message);
				handleMessage(message, allMessages);
			}
			
		});
		
		message.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					handleMessage(message, allMessages);	
					e.consume();
				}
			}

		});
		this.add(south, BorderLayout.SOUTH);
	}
	
}
