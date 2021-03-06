package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/welcome")
	public String getResult() {
		return "welcome to user management application";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return this.userService.getUsers();
		
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId){
		return this.userService.getUser(Long.parseLong(userId));	
	}
	
	// Use to add new user 
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
		
	}

}
