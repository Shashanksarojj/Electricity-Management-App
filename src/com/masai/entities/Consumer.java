package com.masai.entities;

import java.io.Serializable;

public class Consumer extends User implements Serializable{
 
	private double accountBalance;
//	private List<Bills> bills;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(String userName, String password, String address, String email,double accountBalance) {
		super(userName, password, address, email);
		// TODO Auto-generated constructor stub
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		String data = super.toString();
		return "Consumer [accountBalance=" + accountBalance +  "data" + "]";
	}
	
	
	
}
