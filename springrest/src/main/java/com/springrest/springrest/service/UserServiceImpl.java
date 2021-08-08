package com.springrest.springrest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entities.User;

@Service
public class UserServiceImpl implements UserService {

	//public List<User> list;
	@Autowired
	private UserDao userdao; 
	
	public UserServiceImpl() {
		/*list= new 	ArrayList<>();
		list.add(new User(123L,"ABC","abc@gmail.com","admin"));
		list.add(new User(564L,"XYZ","xyz@gmail.com","admin"));
		list.add(new User(900L,"Pqr","pqr@gmail.com","admin"));*/
		//userdao.findAll();
	}		

	@Override
	public User getUser(long userId) {
		return userdao.getOne(userId);
	}

	@Override
	public User addUser(User user) {
		return userdao.save(user);
	}

	@Override
	public List<User> getUsers() {		
		return userdao.findAll();
	}

	

}
