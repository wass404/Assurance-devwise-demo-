package com.solvecys.assurance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solvecys.assurance.entities.LnAssurance;

@Repository
public interface LnAssuranceRepository extends JpaRepository<LnAssurance, Integer> {

}
