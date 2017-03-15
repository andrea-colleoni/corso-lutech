package it.lutech.corso;

public class App {

	public static void main(String[] args) {
		Client client = new Client();
		client.setCc(new ClasseConcreta_V2());
		client.usaContratto();

	}

}
