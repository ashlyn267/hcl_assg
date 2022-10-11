package org.alvas.hibernate_customer_crud_controller;

import java.util.Scanner;

import org.alvas.hibernate_customer_crud_dao.CustomerDao;
import org.alvas.hibernate_customer_crud_dto.Customer;

public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer customer;
		CustomerDao customerDao=new CustomerDao();
		
		while(true)
		{
			System.out.println("1.save customer\n2.Update customer\n3.delete customer\n"
					+ "4.display details\nEnter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:{
				customer=new Customer();
				System.out.println("Enter the customer name");
				customer.setName(sc.next());
				System.out.println("Enter the customer email");
				customer.setEmail(sc.next());
				customerDao.saveCustomer(customer);
			}
			case 2:{
				
				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the email");
				String email=sc.next();
				
				Customer customer1=customerDao.updateCustomer(id,name,email);
				
				
				
			}
			
			case 3:{
				System.out.println("enter the id to delete");
				int id=sc.nextInt();
				customerDao.deleteCustomerById(id);
			}
			case 4:
			{
				customerDao.getAllData();
			}
			}
			
		}
		
		

	}

}
