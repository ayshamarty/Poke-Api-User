package com.bae.pokeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.pokeapi.persistence.domain.User;

@Service
public interface UserService {

	User createUser(User user);

	List<User> getAllUsers();

	Boolean checkUser(Long id);

	User getOne(Long id);

}
