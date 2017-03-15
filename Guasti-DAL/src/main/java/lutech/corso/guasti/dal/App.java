package lutech.corso.guasti.dal;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegnalazioneGuasti-DAL");
		EntityManager em = emf.createEntityManager();
		
		// creazione nuovo utente
//		Utente u = new Utente();
//		u.setUsername("andrea.c");
//		u.setNome("Andrea");
//		u.setCognome("Colleoni");
//		
//		em.getTransaction().begin();
//		em.persist(u);
//		em.getTransaction().commit();
		
		Utente u = em.find(Utente.class, "andrea.c");
		
		for(Segnalazione s : u.getSegnalazioniProprietario()) {
			System.out.println(s.getOggetto());
		}
		
		// faccio delle modifiche ai miei oggetti
		// aggiungo una segnalazione
		Segnalazione s = new Segnalazione();
		s.setOggetto("Test da java....");
		u.addSegnalazioneProprietario(s);
//		s.setSegnalatore(u);
//		u.getSegnalazioniProprietario().add(s);
		
		u.setDataNascita(new Date());
		
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		
		// cancellazione
//		Segnalazione s4 = em.find(Segnalazione.class, 4);
//		em.getTransaction().begin();
//		em.remove(s4);
//		em.getTransaction().commit();
		
		String nome = "Mario";
		List<Segnalazione> elenco = em.createQuery("select s from Segnalazione s "
				+ "where s.segnalatore.nome = :nomeSegnalatore", Segnalazione.class)
						.setParameter("nomeSegnalatore", nome)
						.getResultList();
		for(Segnalazione seg : elenco) {
			System.out.println(seg.getOggetto());
		}
	}

}
