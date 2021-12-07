package observer;

public interface Subscriber {
	public void notifica(String messaggio);
	
	public String getNome();
	
	public Integer getIdSubscriber();
}
