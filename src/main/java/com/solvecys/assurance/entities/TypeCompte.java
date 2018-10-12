package com.solvecys.assurance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeCompte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idType_compte")
	int idTypeCompte;
	
	@Column(name = "type_2")
	String type_2;

	public TypeCompte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeCompte(String type_2) {
		super();
		this.type_2 = type_2;
	}

	public int getIdTypeCompte() {
		return idTypeCompte;
	}

	public void setIdTypeCompte(int idTypeCompte) {
		this.idTypeCompte = idTypeCompte;
	}

	public String getType_2() {
		return type_2;
	}

	public void setType_2(String type_2) {
		this.type_2 = type_2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTypeCompte;
		result = prime * result + ((type_2 == null) ? 0 : type_2.hashCode());
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
		TypeCompte other = (TypeCompte) obj;
		if (idTypeCompte != other.idTypeCompte)
			return false;
		if (type_2 == null) {
			if (other.type_2 != null)
				return false;
		} else if (!type_2.equals(other.type_2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TypeCompte [idTypeCompte=" + idTypeCompte + ", type_2=" + type_2 + "]";
	}
	

}
