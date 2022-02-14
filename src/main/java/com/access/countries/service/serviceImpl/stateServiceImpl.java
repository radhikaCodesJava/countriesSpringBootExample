package com.access.countries.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.countries.entity.stateEntity;
import com.access.countries.model.stateDTO;
import com.access.countries.repo.stateRepository;
import com.access.countries.service.stateService;
import com.access.countries.util.stateMapper;

@Service
public class stateServiceImpl implements stateService {
	
	@Autowired
	stateRepository sateRepo;
	
	@Autowired
	stateMapper stateMap;

	//public List<stateDTO> getAllStates()  //throws ResourceNotFoundException;
	public List<stateDTO> getAllStates()
	{
			List<stateEntity> stateEntityList= sateRepo.findAll();
			return stateMap.toStateDTOList(stateEntityList);
			//return stateEntityList;
			
		
		
	}
}
