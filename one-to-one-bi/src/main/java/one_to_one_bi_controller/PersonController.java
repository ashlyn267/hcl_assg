package one_to_one_bi_controller;

import java.util.Scanner;

import one_to_one_bi_dao.PersonDao;
import one_to_one_bi_dto.Pan;
import one_to_one_bi_dto.Person;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao dao=new PersonDao();
		Person person=new Person();
		Pan pan =new Pan();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.save Person aadhar\n"
					+ "2.display\n3.delete\n4.update\nChoose your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				pan.setPanNumber("9119077877");
				pan.setPanAddress("chennai");
				person.setPersonName("delma");
				person.setPersonEmail("delamd@gmail.com");
				pan.setPerson(person);
				dao.savePerson(person, pan);
				break;
				
			}
			case 2:{
				int personId=1;
				Person person2=dao.getById(personId);
				System.out.println("person details");
				System.out.println(person2.getPersonId()+" "+person2.getPersonName()+" "+person2.getPersonEmail());
				System.out.println("pan details");
				System.out.println(person2.getPan().getPanId()+" "+person2.getPan().getPanNumber()+" "+person.getPan().getPanAddress());
				break;
			}
			case 3:{
				int personId=1;
				dao.delById(personId);
				System.out.println("deleted successfully");
				break;
				
				
			}
			
			}
			

			}
		

}
}
