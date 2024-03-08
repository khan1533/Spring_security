package com.jwt.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.jwt.model.User;

@Service
public class UserService {

	private List<User> store= new ArrayList<>();
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "aksh", "aksjd"));
	}
	public List<User> getUsers(){
		return store;
	}
}
