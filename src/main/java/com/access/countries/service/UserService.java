package com.access.countries.service;

import java.util.List;

import com.access.countries.model.UserDTO;

public interface UserService {
	public List<UserDTO> getAllUsers();
	public UserDTO createNewUser(UserDTO newUser);
	
}
