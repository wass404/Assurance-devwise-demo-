package com.solvecys.assurance.controllers;

import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solvecys.assurance.entities.Compte;
import com.solvecys.assurance.entities.Credit;
import com.solvecys.assurance.services.CreditService;

@RestController
@RequestMapping("/api")
public class CreditController {
	@Autowired
	private CreditService creditService;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/saveCredit")
	public void createAffilee(@Valid @RequestBody Credit credit) throws URISyntaxException {
		creditService.create(credit);
	}
	
	
	@RequestMapping(value = "/comptesByCredit", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<Credit> getComptesCredit(@RequestBody Compte compte) {
		return creditService.findByCompte(compte);
	}
	
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<Credit> getAll() {
		return creditService.findAll();
	}
}
