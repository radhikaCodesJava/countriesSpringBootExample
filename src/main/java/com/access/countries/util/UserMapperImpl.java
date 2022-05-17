package com.access.countries.util;

import com.access.countries.entity.UserEntity;
import com.access.countries.model.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-05T00:04:09-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toUserDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        long id = 0L;

        id = userEntity.getId();

        UserDTO userDTO = new UserDTO( id );

        userDTO.setUsername( userEntity.getUsername() );
        userDTO.setEmail( userEntity.getEmail() );
        userDTO.setPassword( userEntity.getPassword() );

        return userDTO;
    }

    @Override
    public UserEntity toUserEntity(UserDTO userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDto.getId() );
        userEntity.setUsername( userDto.getUsername() );
        userEntity.setEmail( userDto.getEmail() );
        userEntity.setPassword( userDto.getPassword() );

        return userEntity;
    }

    @Override
    public List<UserDTO> toUserDTOList(List<UserEntity> countryEntities) {
        if ( countryEntities == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( countryEntities.size() );
        for ( UserEntity userEntity : countryEntities ) {
            list.add( toUserDTO( userEntity ) );
        }

        return list;
    }

    @Override
    public List<UserEntity> toUserEntityList(List<UserDTO> countryDTOs) {
        if ( countryDTOs == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( countryDTOs.size() );
        for ( UserDTO userDTO : countryDTOs ) {
            list.add( toUserEntity( userDTO ) );
        }

        return list;
    }
}
