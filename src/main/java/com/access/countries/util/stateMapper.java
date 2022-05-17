package com.access.countries.util;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.access.countries.entity.stateEntity;
import com.access.countries.model.stateDTO;

@Mapper(componentModel = "spring", implementationPackage = "com.access.countries.util",uses=countryMapper.class)
public interface stateMapper {

stateMapper INSTANCE = Mappers.getMapper(stateMapper.class);

@Mapping(target="country_stateId", source="stateCountryEntity.countryId")
	stateDTO toStateDTO(stateEntity savedEntity);
		
@InheritInverseConfiguration
		stateEntity toStateEntity(stateDTO stateDTO);
		 
	   	List<stateDTO> toStateDTOList(List<stateEntity> stateEntities);
		 
		 List<stateEntity> toStateEntityList(List<stateDTO> stateDTOs);
}
