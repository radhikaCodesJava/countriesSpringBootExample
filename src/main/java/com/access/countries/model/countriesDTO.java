package com.access.countries.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.access.countries.entity.stateEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class countriesDTO {
    @NonNull
	private Integer countryId;
	@NonNull
	private String countryName;
	@NonNull
	private String continentName;
	
	private Date independenceDate;
	
	private Integer populationCnt;
	
	private String currencyName;
	
	private Integer countryCode;
	
	private String countryCaptial;
	
	}
