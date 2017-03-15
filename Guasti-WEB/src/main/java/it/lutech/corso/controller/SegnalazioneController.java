package it.lutech.corso.controller;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lutech.corso.guasti.dal.Segnalazione;

@Controller
public class SegnalazioneController {
	
	@Autowired
	EntityManagerFactory emf;
	
	@RequestMapping(path="/saluta", method=RequestMethod.GET)
	public String saluta(String messaggio, ModelMap model) {
		model.addAttribute("saluto", "Ciao, " + messaggio);
		return "saluta";
	}
	
//	@RequestMapping(path="/segnalazioni", method=RequestMethod.GET)
//	public String elencoSegnalazioni(ModelMap model) {
//		emf.getCache().evictAll();
//		List<Segnalazione> lista = emf
//				.createEntityManager()
//				.createQuery("select s from Segnalazione s", Segnalazione.class)
//				.getResultList();
//		
//		model.addAttribute("segnalazioni", lista);
//		return "elencoSegnalazioni";
//	}
	
	@RequestMapping(path="/segnalazioni", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody String elencoSegnalazioni(ModelMap model) throws JsonProcessingException {
		emf.getCache().evictAll();
		List<Segnalazione> lista = emf
				.createEntityManager()
				.createQuery("select s from Segnalazione s", Segnalazione.class)
				.getResultList();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(lista);
	}	
	
	
	@RequestMapping(path="/segnalazioni/{id}", method=RequestMethod.GET)
	public String segnalazionePerId(@PathVariable int id, ModelMap model) {
		emf.getCache().evictAll();
		Segnalazione segn = emf
				.createEntityManager().find(Segnalazione.class, id);
		
		model.addAttribute("segnalazione", segn);
		return "segnalazione";
	}
}
