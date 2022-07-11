package com.trivadis.spring.user.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.trivadis.spring.user.domain.User;

@Component("myUserService")
@Primary
public class UserServiceImpl2 implements UserService {

	@Override
	public List<User> getAllUsers() {
		return Arrays.asList(new User("xxxx", "yyyy"));
	}
}
