package observer;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Chat extends JPanel implements Subscriber {
	
	private static final long serialVersionUID = 4213060829881951932L;
	private int idSubscriber;
	private String nome;
	public JTextArea message;
	public JTextPane allMessages;
	private StyledDocument doc;
	private SimpleAttributeSet left;
	private SimpleAttributeSet right;
    
    public void impostaAlignment() {
    	left = new SimpleAttributeSet();
    	StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
    	
    	right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
    }

	public void handleMessage(JTextArea message) {
		try {
			String messaggio = "";
			if(!allMessages.getText().equals("")) 
				messaggio += "\n";
			
			doc.insertString(doc.getLength(), messaggio + message.getText(), right);
			doc.setParagraphAttributes(doc.getLength(), 1, right, false);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		message.setText("");
	}
	
	public void notifica(String messaggio) {
		try {
			if(!allMessages.getText().equals("")) 
				messaggio = "\n" + messaggio;
			
			doc.insertString(doc.getLength(), messaggio, left);
			doc.setParagraphAttributes(doc.getLength(), 1, left, false);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		message.setText("");
	}

	public Chat(String nome) {
		
		this.nome = nome;
		
		this.idSubscriber = Main.getIdUtente();
		
		this.setLayout(new BorderLayout());
		
		allMessages = new JTextPane();
		impostaAlignment();
		doc = allMessages.getStyledDocument();
		allMessages.setEditable(false);
		JScrollPane scrollAllMessages = new JScrollPane(allMessages);
		this.add(scrollAllMessages, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		south.setLayout(new BoxLayout(south, BoxLayout.LINE_AXIS));
		message = new JTextArea();
		message.setLineWrap(true); //scorrimento solo verticale
		JScrollPane scrollMessages = new JScrollPane(message);
		JButton send = new JButton("send");
		south.setPreferredSize(new Dimension(550, 100));
		south.add(scrollMessages);
		south.add(send);
		
		send.addActionListener(new ControlliInvioMessaggio(this));
		
		message.addKeyListener(new ControlliInvioMessaggio(this));
		this.add(south, BorderLayout.SOUTH);
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Integer getIdSubscriber() {
		return idSubscriber;
	}
	
}
