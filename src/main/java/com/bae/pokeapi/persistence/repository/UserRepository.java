package com.bae.pokeapi.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.pokeapi.persistence.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
