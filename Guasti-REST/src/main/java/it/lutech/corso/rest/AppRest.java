package it.lutech.corso.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class AppRest extends ResourceConfig {

	public AppRest() {
		packages("it.lutech.corso.rest");
	}
	
}
