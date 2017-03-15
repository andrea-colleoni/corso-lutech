package it.lutech.corso.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calcolatrice {
	
	@WebMethod
	public int somma(int a, int b) {
		return a + b;
	}

}
