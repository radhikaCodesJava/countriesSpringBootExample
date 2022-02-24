package com.access.countries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	
	//@Column(name="user_state_id")
	//private Integer user_state_id;
	
	@ManyToOne
	@JoinColumn(name = "user_state_id", nullable = false)//, unique = true, insertable=true, updatable=false, referencedColumnName = "country_id")
	//@JsonIgnore
	@javax.persistence.Embedded
	private stateEntity statesEntity;
	
//cart table one to one
//user table - every user has one address -one to one- members in family has same address. so dont make address unique.
	//
}
