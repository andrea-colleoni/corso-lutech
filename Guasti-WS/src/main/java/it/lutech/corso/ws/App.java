package it.lutech.corso.ws;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		Endpoint
			.create(new Servizio2())
			.publish("http://localhost:8080/ws");

	}

}
