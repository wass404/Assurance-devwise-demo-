package com.solvecys.assurance.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solvecys.assurance.entities.Compte;
import com.solvecys.assurance.repositories.CompteRepository;

@Service
@Transactional
public class CompteServices {

	@Autowired
	private CompteRepository compteRepository;

	public void create(Compte compte) {

		compteRepository.save(compte);
	}

	public List<Compte> findAll() {
		return compteRepository.findAll();
	}
	
	public List<Map<String, Object>> ComptesAvecTousLesInformations() {
		return compteRepository.ListTousLesComptes();
	}

}
