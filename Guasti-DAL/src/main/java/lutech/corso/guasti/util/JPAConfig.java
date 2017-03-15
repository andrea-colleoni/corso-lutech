package lutech.corso.guasti.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConfig {

	// SINGLETON: istanza privata statica della classe
	private static JPAConfig instance;

	private EntityManagerFactory emf;
	
	// SINGLETON: costruttore privato
	private JPAConfig() {
		super();
		emf = Persistence.createEntityManagerFactory("SegnalazioneGuasti-DAL");
	}
	
	// SINGLETON: ottengo l'istanza statica privata
	public static JPAConfig getInstance() {
		if (instance == null)
			instance = new JPAConfig();
		return instance;
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}	

}
