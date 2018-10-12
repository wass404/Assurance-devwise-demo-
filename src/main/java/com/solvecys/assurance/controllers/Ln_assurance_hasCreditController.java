package com.solvecys.assurance.controllers;

import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solvecys.assurance.entities.Ln_assurance_has_Credit;
import com.solvecys.assurance.services.Ln_assurance_has_CreditService;

@RestController
@RequestMapping("/api")
public class Ln_assurance_hasCreditController {

	@Autowired
	private Ln_assurance_has_CreditService assurance_has_CreditService ;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/save")
	public void create(@Valid @RequestBody Ln_assurance_has_Credit ln_assurance_has_Credit) throws URISyntaxException {
		assurance_has_CreditService.create(ln_assurance_has_Credit);
	}
}
