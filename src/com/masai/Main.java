package com.masai;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Bills;
import com.masai.entities.Consumer;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.utility.Admin;
import com.masai.utility.FileExists;
import com.masai.utility.IDGeneration;
import com.service.CustomerService;
import com.service.CustomerServiceImpl;

public class Main {
	
	
	

	public static void adminLogin(Scanner sc) throws InvalidDetailsException {

		System.out.println("Enter the AdminID");
		String userName = sc.next();
		System.out.println("Enter the Admin password");
		String password = sc.next();
		if (userName.equals(Admin.username) && password.equals(Admin.password)) {

			System.out.println("successfully login");
		} else {
			throw new InvalidDetailsException("Invalid Admin Credentials");
		}
	}
   
	private static void adminFunctionality(Scanner sc, Map<String, Consumer> consumerlist,List<Bills> bills ) throws InvalidDetailsException {
		
		adminLogin(sc);
		
		CustomerService consumerSer = new CustomerServiceImpl(); 
		
		int choice = 0;
		
		try {
			do {
				System.out.println("Press 1 add the Consumer");
				System.out.println("Press 2 view all the Consumer");
//				System.out.println("Press 3 delete the product");
//				System.out.println("Press 4 update the product");
//				System.out.println("Press 5 view all customers");
//				System.out.println("Press 6 to view all transactions");
				System.out.println("Press 7 to log out");
				choice = sc.nextInt();
				
//				System.out.println(choice);

				switch (choice) {
				case 1:
					String added = adminAddConsumer(sc, consumerlist,new Consumer());
					System.out.println("Choice Selected " + added);
					break;
				case 2:

//					adminViewAllConsumer(consumerlist ,consumerSer);
					System.out.println("Choice Selected " + choice);
					break;
				case 3:

//					adminDeleteProduct(sc, products, prodService);
					System.out.println("Choice Selected " + choice);
					break;
				case 4:

//					String upt = adminUpdateProduct(sc, products, prodService);
					System.out.println("Choice Selected " + choice);
					break;
				case 5:
//					adminViewAllCustomers(customers, cusService);
					System.out.println("Choice Selected " + choice);

					break;
				case 6:
//					adminViewAllTransactions(transactions, trnsactionService);
					System.out.println("Choice Selected " + choice);
					break;
				case 7:
					System.out.println("admin has successfully logout");
//					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
					
				}

			} while (choice <= 6);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static String adminAddConsumer(Scanner sc, Map<String, Consumer> consumerList, Consumer consumer) {

		String str = null;
		System.out.println("please enter the Consumer details");
		System.out.println("Enter the Consumer name");
		String name = sc.next();
		System.out.println("Enter the Password");
		String qty = sc.next();
		
		System.out.println("Enter the Email");
		String email = sc.next();
		System.out.println("Enter the Account Balance");
		Double acc = sc.nextDouble();
		System.out.println("Enter address.");
		sc.nextLine();
		String address = sc.nextLine();

		Consumer con = new Consumer(IDGeneration.generateId(),name, qty, address,email,acc);

		str = CustomerService.addConsumer(con, consumerList);// considering all details are valid

		return str;

	}
	
	
	
	public static void main(String[] args) {
		
//		Map<Integer, Product> products = FileExists.productFile();
		Map<String, Consumer > consumers = FileExists.customerFile();
		List<Bills> Bills = FileExists.transactionFile();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome , in Electricity  Management System");
		
//		adminFunctionality(sc);
		
		try {

			int preference = 0;
			do {
				System.out.println("Please enter your preference, " + " '1' --> Admin login , '2' --> Customer login , "
				+ "'3' for Customer signup, '0' for exit");
				preference = sc.nextInt();
				switch (preference) {
				case 1:
					System.out.println(1);
					adminFunctionality(sc, consumers, Bills);
					
					break;
				case 2:
					System.out.println(2);
//					customerFunctionality(sc, customers, products, transactions);
					break;

				case 3:
					System.out.println(3);
//					customerSignup(sc, customers);
					break;

				case 0:
					System.out.println("successfully existed from the system");

					break;

				default:
					throw new IllegalArgumentException("Invalid Selection");
				}

			}

			while (preference != 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			// serialization (finally always executed)
			try {
				
//				ObjectOutputStream poos = new ObjectOutputStream(new FileOutputStream("Product.ser"));
//				poos.writeObject(products);
				ObjectOutputStream coos = new ObjectOutputStream(new FileOutputStream("Consumer.ser"));
				coos.writeObject(consumers);

				ObjectOutputStream toos = new ObjectOutputStream(new FileOutputStream("Bills.ser"));
				toos.writeObject(Bills);
			//	System.out.println("serialized..........");
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}
		
	
}
