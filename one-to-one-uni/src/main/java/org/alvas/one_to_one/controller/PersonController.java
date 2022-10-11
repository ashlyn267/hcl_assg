package org.alvas.one_to_one.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dto.Aadhar;
import org.alvas.one_to_one.dto.Person;
import org.alvas.one_to_one_dao.Persondao;

public class PersonController {
	static Person person=new Person();
	static Aadhar aadhar =new Aadhar();
	static Persondao dao=new  Persondao();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.save Person aadhar\n"
					+ "2.display\n3.delete\n4.update\nChoose your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				aadhar.setAno(23456778);
				aadhar.setAddress("mangalore");
				
				person.setName("uppu");
				person.setEmail("uppu@gmail.com");
				person.setAadhar(aadhar);
				dao.savePerson(person,aadhar);
				break;
			}
			case 2:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				Person person=dao.getPersonAadhar(id);
				System.out.println("person details");
				System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getEmail());
				System.out.println("aadhar details");
				System.out.println(person.getAadhar().getId());
				System.out.println(person.getAadhar().getAno());
				System.out.println(person.getAadhar().getAddress());
				break;
				
			}
			case 3:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				dao.deleteById(id);
			}
			case 4:{
				System.out.println("enter id to update");
				int id=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the aadhar no");
				long ano=sc.nextLong();
				dao.updatePerson(id, name, ano);
				
			}
			
			}
		}
		
		

	}

}
