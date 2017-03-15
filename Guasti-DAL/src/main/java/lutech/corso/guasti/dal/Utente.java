package lutech.corso.guasti.dal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utente {
	
	@Id
	private String username;
	private String nome;
	private String cognome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	
	@OneToMany(mappedBy="segnalatore", cascade=CascadeType.ALL)
	@JsonIgnore
	@XmlTransient
	private List<Segnalazione> segnalazioniProprietario;
	@OneToMany(mappedBy="manutentore")
	@JsonIgnore
	@XmlTransient
	private List<Segnalazione> segnalazioniManutentore;
	
	public void addSegnalazioneProprietario(Segnalazione s) {
		if (segnalazioniProprietario == null)
			segnalazioniProprietario = new ArrayList<>();
		segnalazioniProprietario.add(s);
		s.setSegnalatore(this);
	}
	
	public List<Segnalazione> getSegnalazioniProprietario() {
		return segnalazioniProprietario;
	}
	public void setSegnalazioniProprietario(List<Segnalazione> segnalazioniProprietario) {
		this.segnalazioniProprietario = segnalazioniProprietario;
	}
	public List<Segnalazione> getSegnalazioniManutentore() {
		return segnalazioniManutentore;
	}
	public void setSegnalazioniManutentore(List<Segnalazione> segnalazioniManutentore) {
		this.segnalazioniManutentore = segnalazioniManutentore;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
