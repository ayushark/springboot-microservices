package com.user.user_service.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.user.user_service.entities.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
				new User(101L, "Ayush", "7999846163"),
				new User(102L, "Ayushraj Khare", "7999846164")
			);
			
	
	@Override
	public User getUser(long id) {
		
		return list.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);
	}

}
