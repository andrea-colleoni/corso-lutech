package it.lutech.corso.ws;

import javax.jws.WebService;

@WebService
public class Servizio2 implements Interfaccia {

	public String test(int a, int b) {
		return "Risultato dell'interfaccia: " + (a + b);
	}

}
