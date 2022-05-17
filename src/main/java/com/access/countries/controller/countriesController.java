package com.access.countries.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.access.countries.entity.countriesEntity;
import com.access.countries.model.countriesDTO;
import com.access.countries.repo.countryRepository;
import com.access.countries.service.countryService;


@RestController
@RequestMapping
public class countriesController {
	
	//@Autowired
	//countryRepository countryrepo;
	
	@Autowired
	countryService countryService;
	
	@GetMapping(value="/countries" ,produces = "application/json")
	private ResponseEntity<?> getCountries() //throws ResourceNotFoundException   
	{ 
		System.out.println("in getall countries");
		List<countriesDTO> listOfCountries =countryService.getAllCountries();
		
		return ResponseEntity.ok(listOfCountries); 
		
	}  

}
