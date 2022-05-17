package com.access.countries.util;

import com.access.countries.entity.countriesEntity;
import com.access.countries.entity.stateEntity;
import com.access.countries.model.countriesDTO;
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
public class countryMapperImpl implements countryMapper {

    @Override
    public countriesDTO toCountryDTO(countriesEntity savedEntity) {
        if ( savedEntity == null ) {
            return null;
        }

        countriesDTO countriesDTO = new countriesDTO();

        countriesDTO.setCountryIdNum( savedEntity.getCountryId() );
        countriesDTO.setCountryName( savedEntity.getCountryName() );
        countriesDTO.setContinentName( savedEntity.getContinentName() );
        countriesDTO.setIndependenceDate( savedEntity.getIndependenceDate() );
        countriesDTO.setPopulationCnt( savedEntity.getPopulationCnt() );
        countriesDTO.setCurrencyName( savedEntity.getCurrencyName() );
        countriesDTO.setCountryCode( savedEntity.getCountryCode() );
        countriesDTO.setCountryCaptial( savedEntity.getCountryCaptial() );
        List<stateEntity> list = savedEntity.getStateList();
        if ( list != null ) {
            countriesDTO.setStateList( new ArrayList<stateEntity>( list ) );
        }

        return countriesDTO;
    }

    @Override
    public countriesEntity toCountryEntity(countriesDTO progDTO) {
        if ( progDTO == null ) {
            return null;
        }

        countriesEntity countriesEntity = new countriesEntity();

        countriesEntity.setCountryId( progDTO.getCountryIdNum() );
        countriesEntity.setCountryName( progDTO.getCountryName() );
        countriesEntity.setContinentName( progDTO.getContinentName() );
        countriesEntity.setIndependenceDate( progDTO.getIndependenceDate() );
        countriesEntity.setPopulationCnt( progDTO.getPopulationCnt() );
        countriesEntity.setCurrencyName( progDTO.getCurrencyName() );
        countriesEntity.setCountryCode( progDTO.getCountryCode() );
        countriesEntity.setCountryCaptial( progDTO.getCountryCaptial() );
        List<stateEntity> list = progDTO.getStateList();
        if ( list != null ) {
            countriesEntity.setStateList( new ArrayList<stateEntity>( list ) );
        }

        return countriesEntity;
    }

    @Override
    public List<countriesDTO> toCountryDTOList(List<countriesEntity> countryEntities) {
        if ( countryEntities == null ) {
            return null;
        }

        List<countriesDTO> list = new ArrayList<countriesDTO>( countryEntities.size() );
        for ( countriesEntity countriesEntity : countryEntities ) {
            list.add( toCountryDTO( countriesEntity ) );
        }

        return list;
    }

    @Override
    public List<countriesEntity> toCountryEntityList(List<countriesDTO> countryDTOs) {
        if ( countryDTOs == null ) {
            return null;
        }

        List<countriesEntity> list = new ArrayList<countriesEntity>( countryDTOs.size() );
        for ( countriesDTO countriesDTO : countryDTOs ) {
            list.add( toCountryEntity( countriesDTO ) );
        }

        return list;
    }
}
