package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Bills implements Serializable{
	
	private String userName;
	private String email;
	private double payment;
	private LocalDateTime time;
	
	public Bills(String userName, String email, double payment, LocalDateTime time) {
		super();
		this.userName = userName;
		this.email = email;
		this.payment = payment;
		this.time = time;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Bills [userName=" + userName + ", email=" + email + ", payment=" + payment + ", time=" + time + "]";
	}
	
	
	
	
	
	
}
