package com.bae.pokeapi.service;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.pokeapi.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerMockitoTests {

	@InjectMocks
	UserController controller;

	@Mock
	UserService service;

}
