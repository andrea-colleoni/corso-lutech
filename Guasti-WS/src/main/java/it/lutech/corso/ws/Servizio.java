package it.lutech.corso.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Servizio {
	
	@WebMethod
	public String metodo(String a, int b) {
		return "Risultato";
	}

}
