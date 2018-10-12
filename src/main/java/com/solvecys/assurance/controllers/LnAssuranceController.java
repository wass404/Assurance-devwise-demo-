package com.solvecys.assurance.controllers;

import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solvecys.assurance.entities.LnAssurance;
import com.solvecys.assurance.services.AssuranceService;

@RestController
@RequestMapping("/api")
public class LnAssuranceController {

	@Autowired
	private AssuranceService assurance;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/saveAssurance")
	public void create(@Valid @RequestBody LnAssurance lnAssurance) throws URISyntaxException {
		assurance.create(lnAssurance);
	}
}
