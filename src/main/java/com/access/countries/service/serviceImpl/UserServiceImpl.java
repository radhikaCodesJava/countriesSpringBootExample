package com.access.countries.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.access.countries.entity.UserEntity;
import com.access.countries.model.UserDTO;
import com.access.countries.repo.userRepository;

import com.access.countries.util.UserMapper;

@Service
public class UserServiceImpl {
	
	
		
	@Autowired
	userRepository userRepo;
	
	@Autowired
	UserMapper userMap;
	
	public List<UserDTO> getAllUsers()
	{
		List<UserEntity> listOfUserEntites= userRepo.findAll();
		
		List<UserDTO> listofDTOs = userMap.toUserDTOList(listOfUserEntites);
		
		return listofDTOs;
	}

	public UserDTO createNewUser(UserDTO newUser)
	{
		UserEntity userEntity = userMap.toUserEntity(newUser);
		
		UserEntity saveEntity= userRepo.save(userEntity);
		
		UserDTO userDto= userMap.toUserDTO(saveEntity);
		
		return userDto;
	}
}
