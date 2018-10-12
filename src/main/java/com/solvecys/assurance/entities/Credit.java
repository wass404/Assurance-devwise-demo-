package com.solvecys.assurance.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Credit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCredit", unique = true, nullable = false)
	int idCredit;
	@Column(name = "souscripteur")
	String souscripteur;
	
	@Column(name = "capital")
	Float capital;
	
	@Column(name = "date")
	Date date;

	@JsonIgnore
	@NotNull
    @ManyToOne
    @JoinColumn(name="idCompte", nullable=false)
    private Compte compte;
    
//	@JsonIgnore
    @OneToMany(fetch = FetchType.EAGER ,mappedBy = "credit")
    private List<Ln_assurance_has_Credit> assurance_has_Credit ;
    

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Credit(String souscripteur, Float capital, Date date, Compte compte,
			List<Ln_assurance_has_Credit> assurance_has_Credit) {
		super();
		this.souscripteur = souscripteur;
		this.capital = capital;
		this.date = date;
		this.compte = compte;
		this.assurance_has_Credit = assurance_has_Credit;
	}




	public int getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
	}

	public String getSouscripteur() {
		return souscripteur;
	}

	public void setSouscripteur(String souscripteur) {
		this.souscripteur = souscripteur;
	}

	public Float getCapital() {
		return capital;
	}

	public void setCapital(Float capital) {
		this.capital = capital;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@JsonIgnore
	public Compte getCompte() {
		return compte;
	}


	@JsonSetter
	public void setCompte(Compte compte) {
		this.compte = compte;
	}



	public List<Ln_assurance_has_Credit> getAssurance_has_Credit() {
		return assurance_has_Credit;
	}






	public void setAssurance_has_Credit(List<Ln_assurance_has_Credit> assurance_has_Credit) {
		this.assurance_has_Credit = assurance_has_Credit;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assurance_has_Credit == null) ? 0 : assurance_has_Credit.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((compte == null) ? 0 : compte.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idCredit;
		result = prime * result + ((souscripteur == null) ? 0 : souscripteur.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credit other = (Credit) obj;
		if (assurance_has_Credit == null) {
			if (other.assurance_has_Credit != null)
				return false;
		} else if (!assurance_has_Credit.equals(other.assurance_has_Credit))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (compte == null) {
			if (other.compte != null)
				return false;
		} else if (!compte.equals(other.compte))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idCredit != other.idCredit)
			return false;
		if (souscripteur == null) {
			if (other.souscripteur != null)
				return false;
		} else if (!souscripteur.equals(other.souscripteur))
			return false;
		return true;
	}






	@Override
	public String toString() {
		return "Credit [idCredit=" + idCredit + ", souscripteur=" + souscripteur + ", capital=" + capital + ", date="
				+ date + ", compte=" + compte + ", assurance_has_Credit=" + assurance_has_Credit + "]";
	}







	
	
}
