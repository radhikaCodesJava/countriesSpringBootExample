package com.access.countries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.access.countries.entity.stateEntity;
import com.access.countries.repo.stateRepository;
import com.access.countries.service.stateService;

@RestController
@RequestMapping
public class stateController {
	@Autowired
	stateRepository statesRepo;
	
	@Autowired
	stateService statesService;
	
	@GetMapping(value="/states" ,produces = "application/json")
	private ResponseEntity<?> getStates() //throws ResourceNotFoundException   
	{ 
		System.out.println("in getAll States");
		List<stateEntity> listOfStates =statesService.getAllStates();
		//List<stateEntity> listOfStates = statesRepo.findAll();
		return ResponseEntity.ok(listOfStates); 
		
	}  

}
