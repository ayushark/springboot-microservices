package com.user.user_service.service;

import org.springframework.stereotype.Service;

import com.user.user_service.entities.User;

@Service
public interface UserService {

	public User getUser(long id); 
	
	
}
