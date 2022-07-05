package com.user.user_service.entities;

import java.util.List;
import java.util.*;


public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
    List<Contact> contacts=new ArrayList<>();

	
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	public User(Long userId, String name, String phone, ArrayList<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + ", contacts=" + contacts + "]";
	}
	
	
	
	
	
}
