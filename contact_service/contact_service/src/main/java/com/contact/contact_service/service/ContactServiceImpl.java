package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contacts = List.of(
				new Contact(201L,"abc@gmail.com","+91472732",101L),
				new Contact(202L,"xyz@gmail.com","+91472732",101L),
				new Contact(203L,"pqr@gmail.com","+91472732",102L)
			);
			
	
	@Override
	public List<Contact> getContact(long id) {
		
		return contacts.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
	}

}
