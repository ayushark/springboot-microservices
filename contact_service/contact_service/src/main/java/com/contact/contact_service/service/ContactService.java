package com.contact.contact_service.service;

import java.util.List;

import com.contact.contact_service.entities.Contact;

public interface ContactService {

	public List<Contact> getContact(long id);
	
}
