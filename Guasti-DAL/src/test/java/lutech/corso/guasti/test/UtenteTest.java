package lutech.corso.guasti.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lutech.corso.guasti.dal.Utente;

public class UtenteTest {

	EntityManagerFactory emf;
	static final String TEST_USER = "test.user";

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("SegnalazioneGuasti-DAL");

	}

	@After
	public void tearDown() throws Exception {
		EntityManager em = emf.createEntityManager();
		Utente daRimuovere = em.find(Utente.class, TEST_USER);
		if (daRimuovere != null) {
			em.getTransaction().begin();
			em.remove(daRimuovere);
			em.getTransaction().commit();
		}
	}

	@Test
	public void testInsert() {
		EntityManager em = emf.createEntityManager();

		Utente u = new Utente();
		u.setUsername(TEST_USER);
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();

		Utente expected = em.find(Utente.class, TEST_USER);
		if (expected == null) {
			fail("Utente non inserito");
		} else {
			assertEquals(expected, u);
		}
	}

	@Test
	public void testUpdate() {
		EntityManager em = emf.createEntityManager();
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		EntityManager em = emf.createEntityManager();
		fail("Not yet implemented");
	}

	@Test
	public void testSelect() {
		EntityManager em = emf.createEntityManager();
		fail("Not yet implemented");
	}

}
