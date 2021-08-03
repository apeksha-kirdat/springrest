package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.User;

public interface UserService{
	
	public List<User> getUsers();

	public User getUser(long userId);

	public User addUser(User user);
}
