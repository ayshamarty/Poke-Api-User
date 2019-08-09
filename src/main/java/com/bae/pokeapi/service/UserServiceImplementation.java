package com.bae.pokeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.pokeapi.persistence.domain.User;
import com.bae.pokeapi.persistence.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	private UserRepository repository;

	public UserServiceImplementation(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User createUser(User user) {
		System.out.println(user.getUsername());
		return repository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

}
