package com.masai.entities;

import java.io.Serializable;

public class Consumer extends User implements Serializable{
 
	private double accountBalance;
	private int id ;
//	private List<Bills> bills;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(int id,String userName, String password, String address, String email,double accountBalance) {
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String data = super.toString();
		return "Consumer [data" + data + "accountBalance=" + accountBalance +"]";
	}
	
	
	
}
