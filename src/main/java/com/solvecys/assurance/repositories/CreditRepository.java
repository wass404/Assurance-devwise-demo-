package com.solvecys.assurance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solvecys.assurance.entities.Credit;
import com.solvecys.assurance.entities.Compte;
import java.util.List;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer> {
	List<Credit> findByCompte(Compte compte);

}
