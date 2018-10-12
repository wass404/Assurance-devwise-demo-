package com.solvecys.assurance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Ln_assurance_has_Credit implements Serializable{
	@JsonIgnore
	@EmbeddedId
	private Ln_assurance_has_CreditId id= new Ln_assurance_has_CreditId();
	
    @ManyToOne @MapsId("idAssurance")
    private LnAssurance assurance;


    @JsonIgnore
    @ManyToOne @MapsId("idCredit")
    private Credit credit;
	
	@Column(name = "date_souscription")
	private Date dateSouscription;

	public Ln_assurance_has_Credit() {
		super();
	}

	public Ln_assurance_has_Credit(LnAssurance assurance, Credit credit, Date dateSouscription) {
		super();
		this.assurance = assurance;
		this.credit = credit;
		this.dateSouscription = dateSouscription;
	}
	@JsonIgnore
	public Ln_assurance_has_CreditId getId() {
		return id;
	}
	@JsonSetter
	public void setId(Ln_assurance_has_CreditId id) {
		this.id = id;
	}

	public LnAssurance getAssurance() {
		return assurance;
	}

	public void setAssurance(LnAssurance assurance) {
		this.assurance = assurance;
	}
	@JsonIgnore
	public Credit getCredit() {
		return credit;
	}
	@JsonSetter
	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Date getDateSouscription() {
		return dateSouscription;
	}

	public void setDateSouscription(Date dateSouscription) {
		this.dateSouscription = dateSouscription;
	}

	
	
	
}