package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.User;

@Service
public class UserServiceImpl implements UserService {

	public List<User> list;
	
	public UserServiceImpl() {
		list= new 	ArrayList<>();
		list.add(new User(123L,"ABC","abc@gmail.com","admin"));
		list.add(new User(564L,"XYZ","xyz@gmail.com","admin"));
		list.add(new User(900L,"Pqr","pqr@gmail.com","admin"));
	}		
	
	@Override
	public List<User> getUsers() {
				return list;
	}

	@Override
	public User getUser(long userId) {
		User u=null;
		for(User user:list) {			
			if(user.getUserId()== userId) {
				u=user;
				break;
			}
		}
		return u;
	}

	@Override
	public User addUser(User user) {
		list.add(user);		
		return user;
	}

}
