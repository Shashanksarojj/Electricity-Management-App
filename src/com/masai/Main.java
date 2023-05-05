package com.masai;

import java.util.Scanner;

public class Main {
   
	private static void adminFunctionality(Scanner sc) {
		
		
		int choice = 0;
		
		try {
			do {
				System.out.println("Press 1 add the product");
				System.out.println("Press 2 view all the product");
				System.out.println("Press 3 delete the product");
				System.out.println("Press 4 update the product");
				System.out.println("Press 5 view all customers");
				System.out.println("Press 6 to view all transactions");
				System.out.println("Press 7 to log out");
				choice = sc.nextInt();
				
//				System.out.println(choice);

				switch (choice) {
				case 1:
//					String added = adminAddProduct(sc, products, prodService);
					System.out.println("Choice Selected " + choice);
					break;
				case 2:

//					adminViewAllProducts(products, prodService);
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
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		adminFunctionality(sc);
		
	}
}
