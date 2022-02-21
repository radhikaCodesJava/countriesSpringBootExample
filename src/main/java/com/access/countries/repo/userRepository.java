package com.access.countries.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.access.countries.entity.UserEntity;
@Repository
public interface userRepository extends JpaRepository<UserEntity, Integer> {

}
