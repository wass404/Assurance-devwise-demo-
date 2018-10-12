package com.solvecys.assurance.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solvecys.assurance.entities.Compte;
import com.solvecys.assurance.entities.Credit;
import com.solvecys.assurance.repositories.CreditRepository;

@Service
@Transactional
public class CreditService {

	@Autowired
	CreditRepository creditRepository;

	public void create(Credit compte) {
		creditRepository.save(compte);
	}

	public List<Credit> findAll() {
		return creditRepository.findAll();
	}

	public Optional<Credit> findById(int id) {
		return creditRepository.findById(id);
	}
	
	public List<Credit> findByCompte(Compte compte){
		return creditRepository.findByCompte(compte);
	}
}
