package it.lutech.corso.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;

import lutech.corso.guasti.dal.Segnalazione;
import lutech.corso.guasti.util.JPAConfig;

@WebService
public class Segnalazioni {

	@WebMethod
	public List<Segnalazione> elencoSegnalazioni() {
		EntityManager em = JPAConfig.getInstance().getEmf()
			.createEntityManager();
		
		return em.createQuery("select s from Segnalazione s", Segnalazione.class)
				.getResultList();
	}
}
