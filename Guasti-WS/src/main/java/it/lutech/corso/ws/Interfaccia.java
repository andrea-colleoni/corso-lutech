package it.lutech.corso.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Interfaccia {

	@WebMethod
	String test(int a, int b);
}
