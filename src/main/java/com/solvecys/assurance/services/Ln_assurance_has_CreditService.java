package com.solvecys.assurance.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvecys.assurance.entities.Ln_assurance_has_Credit;
import com.solvecys.assurance.repositories.Ln_assurance_has_CreditRepository;

@Service
public class Ln_assurance_has_CreditService {
	@Autowired
	private Ln_assurance_has_CreditRepository assurance_has_CreditRepository;
	
	public void create(Ln_assurance_has_Credit ln_assurance_has_Credit) {
		assurance_has_CreditRepository.save(ln_assurance_has_Credit);
	}
}

//
//package com.solvecys.assurance.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.solvecys.assurance.entities.Credit;
//import com.solvecys.assurance.entities.LnAssurance;
//import com.solvecys.assurance.entities.Ln_assurance_has_Credit;
//import com.solvecys.assurance.repositories.CreditRepository;
//import com.solvecys.assurance.repositories.LnAssuranceRepository;
//import com.solvecys.assurance.repositories.Ln_assurance_has_CreditRepository;
//
//@Service
//public class Ln_assurance_has_CreditService {
//	@Autowired
//	private Ln_assurance_has_CreditRepository assurance_has_CreditRepository;
//	
//	@Autowired
//	private CreditRepository creditRepository;
//	@Autowired
//	private LnAssuranceRepository lnAssuranceRepository;
//
//	public void create(Ln_assurance_has_Credit ln_assurance_has_Credit) {
//		Credit credit = creditRepository.findById(ln_assurance_has_Credit.getCredit().getIdCredit()).get();
//		LnAssurance lnAssurance = lnAssuranceRepository.findById(ln_assurance_has_Credit.getAssurance().getIdLnAssurance()).get();
//		Ln_assurance_has_Credit ac = new Ln_assurance_has_Credit(lnAssurance,credit,ln_assurance_has_Credit.getDateSouscription());
//		assurance_has_CreditRepository.save(ln_assurance_has_Credit);
//	}
//}
