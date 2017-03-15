package lutech.corso.guasti.dal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Segnalazione {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=1000, nullable=false)
	private String oggetto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOraApertura;
	
	@ManyToOne
	private Utente segnalatore;
	@ManyToOne
	private Utente manutentore;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOggetto() {
		return oggetto;
	}
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	public Date getDataOraApertura() {
		return dataOraApertura;
	}
	public void setDataOraApertura(Date dataOraApertura) {
		this.dataOraApertura = dataOraApertura;
	}
	public Utente getSegnalatore() {
		return segnalatore;
	}
	public void setSegnalatore(Utente segnalatore) {
		this.segnalatore = segnalatore;
	}
	public Utente getManutentore() {
		return manutentore;
	}
	public void setManutentore(Utente manutentore) {
		this.manutentore = manutentore;
	}
	
	
}
