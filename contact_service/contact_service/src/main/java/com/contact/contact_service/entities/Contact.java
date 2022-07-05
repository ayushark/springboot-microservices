package com.contact.contact_service.entities;

public class Contact {

	private long cid;
	private String email;
	private String number;
	
	private Long userId;
	
	

	public Contact(long cid, String email, String number, Long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.number = number;
		this.userId = userId;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
