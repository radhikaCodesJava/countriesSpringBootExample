package com.access.countries.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="states_table")
public class stateEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "state_id_seq" )
	@SequenceGenerator( name="stateseq", sequenceName = "states_table_state_id_seq", allocationSize = 1)
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
	
	//@Column(name="country_state_code")
	//@NonNull
	//private Integer countryStateCode;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "country_state_id", nullable = false, unique = true, insertable=true, updatable=false)
	private countriesEntity countryEntity;

}
