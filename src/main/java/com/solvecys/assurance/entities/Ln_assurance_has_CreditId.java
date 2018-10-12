package com.solvecys.assurance.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Ln_assurance_has_CreditId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idAssurance;
	private int idCredit;

	public Ln_assurance_has_CreditId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ln_assurance_has_CreditId(int idAssurance, int idCredit) {
		super();
		this.idAssurance = idAssurance;
		this.idCredit = idCredit;
	}

	public int getIdAssurance() {
		return idAssurance;
	}

	public void setIdAssurance(int idAssurance) {
		this.idAssurance = idAssurance;
	}

	public int getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
