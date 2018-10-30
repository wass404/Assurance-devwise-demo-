package com.solvecys.assurance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solvecys.assurance.entities.LnAssurance;
import com.solvecys.assurance.repositories.LnAssuranceRepository;

@Service
@Transactional
public class AssuranceService {

	@Autowired
	private LnAssuranceRepository lnAssuranceRepository;
	

	public LnAssurance create(LnAssurance lnAssurance) {

		return lnAssuranceRepository.save(lnAssurance);

	}

	public List<LnAssurance> findAll() {
		return lnAssuranceRepository.findAll();
	}
}
