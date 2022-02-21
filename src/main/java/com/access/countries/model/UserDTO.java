package com.access.countries.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {
	@NonNull
	private long id;
	private String username;
	private String email;
	private String password;
	private Integer user_stateId;
}
