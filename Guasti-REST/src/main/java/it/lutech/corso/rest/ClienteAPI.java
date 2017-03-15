package it.lutech.corso.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("cliente")
public class ClienteAPI {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> elencoClienti() {
		List<Cliente> lista = new ArrayList<>();
		Cliente c = new Cliente();
		c.setNome("Mario");
		c.setPartitaIva("3456765");

		lista.add(c);
		
		return lista;
	}
	
	@POST
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Cliente getById(@PathParam("id") int id,
			@QueryParam("citta") String citta,
			@FormParam("parametro") String nome) {
		Cliente c = new Cliente();
		c.setNome(nome + " : " + id);
		c.setPartitaIva("658736457634");
		c.setTelefono(citta);
		return c;
	}
	
	@POST
	@Path("log")
	@Consumes(MediaType.APPLICATION_JSON)
	public void logCliente(Cliente c) {
		System.out.println(c.getPartitaIva());
	}
}
