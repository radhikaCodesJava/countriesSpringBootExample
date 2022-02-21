package com.access.countries.util;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;


import com.access.countries.entity.UserEntity;

import com.access.countries.model.UserDTO;


@Mapper(componentModel = "spring", implementationPackage = "com.access.countries.util")
public interface UserMapper {
	
	//@Mapping(source="countryId", target="countryIdNum")
	UserDTO toUserDTO(UserEntity userEntity);
		
	@InheritInverseConfiguration
		UserEntity toUserEntity(UserDTO userDto);
		 
	   	List<UserDTO> toUserDTOList(List<UserEntity> countryEntities);
		 
		 List<UserEntity> toUserEntityList(List<UserDTO> countryDTOs);

}
