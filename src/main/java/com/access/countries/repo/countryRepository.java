package com.access.countries.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.access.countries.entity.countriesEntity;

@Repository
public interface countryRepository extends JpaRepository<countriesEntity, Integer >{

}
