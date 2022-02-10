package com.access.countries.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.access.countries.entity.stateEntity;

@Repository
public interface stateRepository extends JpaRepository<stateEntity, Integer>{

}
