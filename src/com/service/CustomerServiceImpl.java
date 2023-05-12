package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.masai.entities.Consumer;
import com.masai.exceptions.ConsumerException;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;


public class CustomerServiceImpl implements CustomerService{
	
	
//	public String addConsumer(Consumer pro, Map<String, Consumer> products) {
//		// TODO Auto-generated method stub
////as our email is always unique thats why directly putting into products
//		
//		products.put(String.valueOf(pro.getId()), pro);
//
//		return "Product added successfully";
//
//	}

	public void addConsumer(Consumer cus, Map<String, Consumer> customers) throws DuplicateDataException {

		if (customers.containsKey(cus.getEmail())) {
			throw new DuplicateDataException("Customer already exists , please login");
		} else {

			customers.put(cus.getEmail(), cus);
			
			System.out.println("Successful Created");

		}

	}
	
	@Override
	public boolean login(String email,String password, Map<String, Consumer> customers) throws InvalidDetailsException {

		if (customers.containsKey(email) ) {
			
			if(customers.get(email).getPassword().equals(password)) {
				return true;
			}
			else {
				throw new InvalidDetailsException("Invalid Credentials");
			}
			
		} else {
			throw new InvalidDetailsException("you have not sign up yet, please signup");
		}

	}
	
	@Override
	public Consumer viewCustomerDetails(String email, Map<String, Consumer> customers) {

		if (customers.containsKey(email)) {

			return customers.get(email);

		}

		return null;
	}
	
	@Override
	public List<Consumer> viewAllCustomers(Map<String, Consumer> customers) throws ConsumerException {
		// TODO Auto-generated method stub
		List<Consumer> list = null;

		if (customers != null && customers.size() > 0) {
			Collection<Consumer> coll = customers.values();
			list = new ArrayList<>(coll);
		} else {
			throw new ConsumerException("Consumer list is empty");
		}

		return list;
	}
}
