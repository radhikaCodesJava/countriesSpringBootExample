package com.access.countries.model;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class stateDTO {
    @NonNull
	private Integer stateId;
	
	
	@NonNull
	private String stateName;
	
	@NonNull
	private Integer numCities;
	
	
	private String langSpoken;
	
	
	private String capitalCity;
	
	private Integer country_stateId;
}
