package com.access.countries.util;

import com.access.countries.entity.stateEntity;
import com.access.countries.model.stateDTO;
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
public class stateMapperImpl implements stateMapper {

    @Override
    public stateDTO toStateDTO(stateEntity savedEntity) {
        if ( savedEntity == null ) {
            return null;
        }

        stateDTO stateDTO = new stateDTO();

        stateDTO.setStateId( savedEntity.getStateId() );
        stateDTO.setStateName( savedEntity.getStateName() );
        stateDTO.setNumCities( savedEntity.getNumCities() );
        stateDTO.setLangSpoken( savedEntity.getLangSpoken() );
        stateDTO.setCapitalCity( savedEntity.getCapitalCity() );

        return stateDTO;
    }

    @Override
    public stateEntity toStateEntity(stateDTO stateDTO) {
        if ( stateDTO == null ) {
            return null;
        }

        stateEntity stateEntity = new stateEntity();

        stateEntity.setStateId( stateDTO.getStateId() );
        stateEntity.setStateName( stateDTO.getStateName() );
        stateEntity.setNumCities( stateDTO.getNumCities() );
        stateEntity.setLangSpoken( stateDTO.getLangSpoken() );
        stateEntity.setCapitalCity( stateDTO.getCapitalCity() );

        return stateEntity;
    }

    @Override
    public List<stateDTO> toStateDTOList(List<stateEntity> stateEntities) {
        if ( stateEntities == null ) {
            return null;
        }

        List<stateDTO> list = new ArrayList<stateDTO>( stateEntities.size() );
        for ( stateEntity stateEntity : stateEntities ) {
            list.add( toStateDTO( stateEntity ) );
        }

        return list;
    }

    @Override
    public List<stateEntity> toStateEntityList(List<stateDTO> stateDTOs) {
        if ( stateDTOs == null ) {
            return null;
        }

        List<stateEntity> list = new ArrayList<stateEntity>( stateDTOs.size() );
        for ( stateDTO stateDTO : stateDTOs ) {
            list.add( toStateEntity( stateDTO ) );
        }

        return list;
    }
}
