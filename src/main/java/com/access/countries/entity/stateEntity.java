package com.access.countries.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder

@Entity
@Table(name="states_table")
public class stateEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "state_id_seq" )
	@SequenceGenerator( name="state_id_seq", sequenceName = "states_table_state_id_seq", allocationSize = 1)
	@Column(name="state_id",nullable=false, unique=true, insertable=true, updatable=false)
	@NonNull
	private Integer stateId;
	
	@Column(name="state_name")
	@NonNull
	private String stateName;
	
	@Column(name="num_of_cities")
	@NonNull
	private Integer numCities;
	
	@Column(name="language_spoken")
	@NonNull
	private String langSpoken;
	
	@Column(name="capital_city")
	@NonNull
	private String capitalCity;
	
	@ManyToOne//(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "country_state_id", nullable = false, unique = true, insertable=true, updatable=false, referencedColumnName = "country_id")
	@JsonIgnore
	@javax.persistence.Embedded
	private countriesEntity stateCountryEntity;
	
	@OneToMany(targetEntity = UserEntity.class, mappedBy="statesEntity")
	@JsonIgnore
	private List<UserEntity> userList;
	

}
