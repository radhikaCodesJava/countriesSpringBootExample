package com.access.countries.util;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.access.countries.entity.countriesEntity;
import com.access.countries.model.countriesDTO;

@Mapper(componentModel = "spring", implementationPackage = "com.access.countries.util")
public interface countryMapper {

	countryMapper INSTANCE = Mappers.getMapper(countryMapper.class);
	
	@Mapping(source="countryId", target="countryIdNum")
	countriesDTO toCountryDTO(countriesEntity savedEntity);
		
	@InheritInverseConfiguration
		countriesEntity toCountryEntity(countriesDTO progDTO);
		 
	   	List<countriesDTO> toCountryDTOList(List<countriesEntity> countryEntities);
		 
		 List<countriesEntity> toCountryEntityList(List<countriesDTO> countryDTOs);
}
