package com.masai.entities;

public class User {
	private String userName;
	private String password;
	private String address;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password, String address, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
//		hß
	}
	
	
	
	
}
