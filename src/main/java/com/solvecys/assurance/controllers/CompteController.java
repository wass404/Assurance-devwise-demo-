package com.solvecys.assurance.controllers;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solvecys.assurance.entities.Compte;
import com.solvecys.assurance.services.CompteServices;

@RestController
@RequestMapping("/api")
public class CompteController {
	@Autowired
	private CompteServices compteServices;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/saveCompte")
	public void createAffilee(@Valid @RequestBody Compte compte) throws URISyntaxException {
		compteServices.create(compte);
	}

	@RequestMapping(value = "/comptes", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<Compte> getComptes() {
		return compteServices.findAll();
	}
	
	@RequestMapping(value = "/comptesAvecInformations", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<Map<String, Object>> getComptesWithInfo() {
		return compteServices.ComptesAvecTousLesInformations();
	}


}
