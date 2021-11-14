package proxy;

import javax.sound.sampled.Clip;

public class InterfacciaLettoreAudio {
	
	private Audio audio;
	private Clip clip;
	
	public InterfacciaLettoreAudio() {
		audio = new LettoreAudioProxy();
	}
	
	public void carica(String nomeAudio) {
		clip = audio.carica(nomeAudio);
	}
	
	public void avvia() {
		if(clip != null)
			clip.start();
	}
	
	public void stop()  {
		if(clip != null) 
			clip.stop();
	}
	
	public void impostaDaCapo() {
		if(clip != null)
			clip.setFramePosition(0);
	}
	
	public void restart() {
		if(clip != null) {
			stop();
			clip.setFramePosition(0);
			avvia();
		}
	}
}
