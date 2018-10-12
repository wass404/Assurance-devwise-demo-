package com.solvecys.assurance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LnAssurance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLn_assurance", unique = true, nullable = false)
	int idLnAssurance;
	
	@Column(name = "type_assurance")
	String typeAssurance;
	
	@Column(name = "montant")
	Float montant;
	
	@JsonIgnore
    @OneToMany(mappedBy = "assurance")
    private List<Ln_assurance_has_Credit> assurance_has_Credit;

	public List<Ln_assurance_has_Credit> getAssurance_has_Credit() {
		return assurance_has_Credit;
	}

	public void setAssurance_has_Credit(List<Ln_assurance_has_Credit> assurance_has_Credit) {
		this.assurance_has_Credit = assurance_has_Credit;
	}

	public LnAssurance() {
		super();
	}

	public LnAssurance(String typeAssurance, Float montant) {
		super();
		this.typeAssurance = typeAssurance;
		this.montant = montant;
	}

	public int getIdLnAssurance() {
		return idLnAssurance;
	}

	public void setIdLnAssurance(int idLnAssurance) {
		this.idLnAssurance = idLnAssurance;
	}

	public String getTypeAssurance() {
		return typeAssurance;
	}

	public void setTypeAssurance(String typeAssurance) {
		this.typeAssurance = typeAssurance;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}






	
	
	

}
