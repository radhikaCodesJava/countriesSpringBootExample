package com.access.countries.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.access.countries.entity.stateEntity;
import com.access.countries.model.stateDTO;
import com.access.countries.repo.stateRepository;
import com.access.countries.util.stateMapper;


public class stateServiceImpl {
	
	@Autowired
	stateRepository sateRepo;

	//public List<stateDTO> getAllStates()  //throws ResourceNotFoundException;
	public List<stateEntity> getAllStates()
	{
			List<stateEntity> stateEntityList= sateRepo.findAll();
			//return stateMapper.toStatesDTOList(stateEntityList);
			return stateEntityList;
			
		
		
	}
}
