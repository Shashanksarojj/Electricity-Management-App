package com.service;

import java.util.List;
import java.util.Map;

import com.masai.entities.Consumer;
import com.masai.exceptions.ConsumerException;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;


public interface CustomerService {
	
	
	public static  String addConsumer(Consumer pro, Map<String, Consumer> products) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean login(String email,String password, Map<String, Consumer> customers) throws InvalidDetailsException;

//	public void signUp(Consumer cus, Map<String, Consumer> customers) throws DuplicateDataException;
	
	
	public Consumer viewCustomerDetails(String email, Map<String, Consumer> customers);

	public List<Consumer> viewAllCustomers(Map<String, Consumer> customers) throws ConsumerException;
}
