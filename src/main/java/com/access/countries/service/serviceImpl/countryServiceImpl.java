package com.access.countries.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.countries.entity.countriesEntity;
import com.access.countries.model.countriesDTO;
import com.access.countries.repo.countryRepository;
import com.access.countries.service.countryService;
import com.access.countries.util.countryMapper;


@Service
public class countryServiceImpl implements countryService {
	
	@Autowired
	countryRepository countryRepo;
	@Autowired
	countryMapper countryMap;
	
	       //get 
			public List<countriesDTO> getAllCountries()  //throws ResourceNotFoundException;
			   {
					List<countriesEntity> countriesEntityList= countryRepo.findAll();
					return countryMap.toCountryDTOList(countriesEntityList);
				}
			
			//get by id
			//public countriesDTO getCountryById(Integer countryId)// throws ResourceNotFoundException;
			{
				
				
			}
			//post or save new country
			//public countriesDTO createAndSaveProgram(countriesDTO newCountry)// throws  ResourceAlreadyExistsException;
			{
				
			}
			//update based on countryId
			//public countriesDTO updateCountryById(Integer programId,countriesDTO modifyCountryById)// throws ResourceAlreadyExistsException;
			{
				
			}
			//update based on countryName
			//public countriesDTO updateCountryByName(String programName,countriesDTO modifyCountryByName)// throws ResourceAlreadyExistsException;
			{
				
			}
			//delete by countryId
			//public Boolean deleteCountryById(Integer deleteCountryById)// throws ResourceNotFoundException;
			{
				
			}
			//delete by countryName
			//public List<countriesDTO> deleteCountryByName(String deleteCountryByName)// throws ResourceNotFoundException;
			{
				
			}
}
