package com.jwt.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.jwt.model.User;
import com.jwt.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeConntroller {

	@Autowired
	private UserService userv;
	
//		http://localhost:8081/home/users
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("gettig users");
		return this.userv.getUsers();
	}
}
