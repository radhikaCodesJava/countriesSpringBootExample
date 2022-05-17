package com.access.countries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.access.countries.model.UserDTO;
import com.access.countries.repo.userRepository;
import com.access.countries.service.UserService;
import com.access.countries.service.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	//@Qualifier("UserServiceImpl")
	UserService userService;
	
	
	
	@PostMapping("/creatingUser")
	public ResponseEntity<?> createUser(@RequestBody UserDTO newUser){
		UserDTO userDto = userService.createNewUser(newUser);
		return ResponseEntity.ok(userDto);
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<?> getAllUsers()
	{
		List<UserDTO> listOfUsers = userService.getAllUsers();
		return ResponseEntity.ok(listOfUsers);
	}
}
