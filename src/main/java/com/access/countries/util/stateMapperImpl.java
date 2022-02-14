package com.access.countries.util;

import com.access.countries.entity.countriesEntity;
import com.access.countries.entity.stateEntity;
import com.access.countries.model.stateDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-14T12:04:10-0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class stateMapperImpl implements stateMapper {

    @Override
    public stateDTO toStateDTO(stateEntity savedEntity) {
        if ( savedEntity == null ) {
            return null;
        }

        stateDTO stateDTO = new stateDTO();

        stateDTO.setCountry_stateId( savedEntityCountryEntityCountryId( savedEntity ) );
        stateDTO.setStateId( savedEntity.getStateId() );
        stateDTO.setStateName( savedEntity.getStateName() );
        stateDTO.setNumCities( savedEntity.getNumCities() );
        stateDTO.setLangSpoken( savedEntity.getLangSpoken() );
        stateDTO.setCapitalCity( savedEntity.getCapitalCity() );

        return stateDTO;
    }

    @Override
    public stateEntity toStateEntity(stateDTO progDTO) {
        if ( progDTO == null ) {
            return null;
        }

        stateEntity stateEntity = new stateEntity();

        stateEntity.setStateId( progDTO.getStateId() );
        stateEntity.setStateName( progDTO.getStateName() );
        stateEntity.setNumCities( progDTO.getNumCities() );
        stateEntity.setLangSpoken( progDTO.getLangSpoken() );
        stateEntity.setCapitalCity( progDTO.getCapitalCity() );

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

    private Integer savedEntityCountryEntityCountryId(stateEntity stateEntity) {
        if ( stateEntity == null ) {
            return null;
        }
        countriesEntity countryEntity = stateEntity.getCountryEntity();
        if ( countryEntity == null ) {
            return null;
        }
        Integer countryId = countryEntity.getCountryId();
        if ( countryId == null ) {
            return null;
        }
        return countryId;
    }
}
