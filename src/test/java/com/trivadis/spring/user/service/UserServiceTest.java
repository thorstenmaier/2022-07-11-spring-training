package com.trivadis.spring.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.trivadis.spring.user.domain.User;

//@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestConfig.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testGetAllUsers() {
		List<User> users = userService.getAllUsers();
		assertEquals(3, users.size());
	}

}
