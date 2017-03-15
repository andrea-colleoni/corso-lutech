package it.lutech.corso;

public class Client {
	
	Contratto cc;

	void usaContratto() {
		System.out.println(cc.metodo(10, "pippo"));
	}
	
	public Contratto getCc() {
		return cc;
	}

	public void setCc(Contratto cc) {
		this.cc = cc;
	}	
	

}
