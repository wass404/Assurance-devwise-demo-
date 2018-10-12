package com.solvecys.assurance.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCompte")
	private int idCompte;

	@Column(name = "ex_personne")
	private String ex_personne;

	@Column(name = "rib")
	private long rib;

	@ManyToOne
	@JoinColumn(name = "idTypeCompte", nullable = false)
	private TypeCompte typeCompte;

	@OneToMany(mappedBy = "compte", fetch = FetchType.EAGER)
	private List<Credit> credit;

	public Compte() {
		super();
	}

	public Compte(String ex_personne, long rib, TypeCompte typeCompte) {
		super();
		this.ex_personne = ex_personne;
		this.rib = rib;
		this.typeCompte = typeCompte;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getEx_personne() {
		return ex_personne;
	}

	public void setEx_personne(String ex_personne) {
		this.ex_personne = ex_personne;
	}


	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}

	public TypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}

	public List<Credit> getCredit() {
		return credit;
	}

	public void setCredit(List<Credit> credit) {
		this.credit = credit;
	}





	


	



}
