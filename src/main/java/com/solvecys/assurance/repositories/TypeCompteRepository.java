package com.solvecys.assurance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solvecys.assurance.entities.TypeCompte;

@Repository
public interface TypeCompteRepository extends JpaRepository<TypeCompte, Integer> {

}
