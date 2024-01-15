package com.java8.demo.stream.api;

import java.util.List;

public class Users {
	
	private String name;	
	private String phone;
	private List<String> emails;
	
	public Users(String name, String phone, List<String> emails) {
		this.name = name;
		this.phone = phone;
		this.emails = emails;
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
	
	public List<String> getEmails() {
		return emails;
	}
	
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

}