package com.solvecys.assurance.controllers;

import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.solvecys.assurance.entities.LnAssurance;
import com.solvecys.assurance.services.AssuranceService;

@RestController
@RequestMapping("/api")
public class LnAssuranceController {

	@Autowired
	private AssuranceService assurance;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/saveAssurance")
	public LnAssurance create(@Valid @RequestBody LnAssurance lnAssurance) throws URISyntaxException {
		return assurance.create(lnAssurance);
	}

	@RequestMapping(value = "/assurances", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<LnAssurance> getComptes() {
		return assurance.findAll();
	}

}
