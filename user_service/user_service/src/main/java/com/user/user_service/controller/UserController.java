package com.user.user_service.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.entities.Contact;
import com.user.user_service.entities.User;
import com.user.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		
		// http://localhost:9002/contact/user/101
		
		User user = userService.getUser(userId);
		
		//Deserializing array object in list
		@SuppressWarnings("unchecked")
		List<Contact> contacts =  this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(), List.class);
		
		user.setContacts(contacts);

		return user;
	}
}
   