package com.access.countries.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="countries_table")
public class countriesEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7072124321358258761L;

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "country_id_seq" )
	@SequenceGenerator( name="countryseq", sequenceName = "countries_table_country_id_seq", allocationSize = 1)
	@Column(name="country_id" ,nullable=false, unique=true, insertable=true, updatable=false)
	@NonNull
    private Integer countryId;
	
	@Column(name="country_name")
	@NonNull
    private String countryName;
	
	@Column(name="continent_name")
	@NonNull
    private String continentName;
	
	@Column(name="independent_date")
	@NonNull
	private Date independenceDate;
	
	@Column(name="population_cnt")
	@NonNull
	private Integer populationCnt;
	
	@Column(name="currency_name")
	@NonNull
	private String currencyName;
	
	@Column(name="country_code")
	@NonNull
	private Integer countryCode;
	
	@Column(name="captial_of_country")
	private String countryCaptial;
	
	
	
	
	
	//private List<stateEntity> stateEntities;
}
