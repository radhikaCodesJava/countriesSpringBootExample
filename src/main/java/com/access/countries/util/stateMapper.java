package com.access.countries.util;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import com.access.countries.entity.stateEntity;

import com.access.countries.model.stateDTO;
@Mapper(componentModel = "spring", implementationPackage = "com.access.countries.util")
public interface stateMapper {

stateMapper INSTANCE = Mappers.getMapper(stateMapper.class);

@Mapping(target="country_stateId", source="countryEntity.countryId")
	stateDTO toStateDTO(stateEntity savedEntity);
		
		stateEntity toStateEntity(stateDTO progDTO);
		 
	   	List<stateDTO> toStateDTOList(List<stateEntity> stateEntities);
		 
		 List<stateEntity> toStateEntityList(List<stateDTO> stateDTOs);
}
