package com.solvecys.assurance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solvecys.assurance.entities.Ln_assurance_has_Credit;
import com.solvecys.assurance.entities.Ln_assurance_has_CreditId;

@Repository
public interface Ln_assurance_has_CreditRepository extends JpaRepository<Ln_assurance_has_Credit, Ln_assurance_has_CreditId>{
	
}
