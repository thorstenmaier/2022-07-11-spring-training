package com.trivadis.spring.user;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.trivadis.spring.user.service.UserService;

@Component
public class ServiceClient implements CommandLineRunner {

	// 2.
	@Autowired
	private UserService us; // Field Injection

	// 1.
	public ServiceClient() {
	}

	// 3.
	@PostConstruct
	public void init() {
		System.out.println(" ### PostConstruct");
		us.getAllUsers().forEach(System.out::println);
	}

	// 4.
	@Override
	public void run(String... args) throws Exception {
		System.out.println(" ### CommandLineRunner");
		us.getAllUsers().forEach(System.out::println);
	}
}
