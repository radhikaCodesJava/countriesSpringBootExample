package com.access.countries.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.access.countries.entity.countriesEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NonNull;

public class stateDTO {
    @NonNull
	private Integer stateId;
	
	
	@NonNull
	private String stateName;
	
	@NonNull
	private Integer numCities;
	
	
	private String langSpoken;
	
	
	private String capitalCity;
	
	
}
