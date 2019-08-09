package com.bae.pokeapi.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.pokeapi.persistence.domain.User;
import com.bae.pokeapi.persistence.repository.UserRepository;
import com.bae.pokeapi.service.UserServiceImplementation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceMockitoTests {

	@InjectMocks
	UserServiceImplementation service;

	@Mock
	UserRepository repository;

	private static final User MOCK_USER_1 = new User(1L, "test1", "test1");
	private static final User MOCK_USER_2 = new User(2L, "test2", "test2");

	private List<User> MOCK_LIST = new ArrayList<>();

	@Test
	public void getAllUsersTest() {
		MOCK_LIST.add(MOCK_USER_1);
		MOCK_LIST.add(MOCK_USER_2);
		Mockito.when(repository.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, service.getAllUsers());
		Mockito.verify(repository).findAll();
	}

	@Test
	public void CreateAccountTest() {
		Mockito.when(repository.save(MOCK_USER_1)).thenReturn(MOCK_USER_1);
		assertEquals(MOCK_USER_1, service.createUser(MOCK_USER_1));
		Mockito.verify(repository).save(MOCK_USER_1);
	}
}
