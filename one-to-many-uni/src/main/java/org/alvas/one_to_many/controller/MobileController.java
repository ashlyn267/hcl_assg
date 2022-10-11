package org.alvas.one_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.one_to_many.dao.MobileDao;
import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile = new Mobile();
		Sim sim1 = new Sim();
		Sim sim2 = new Sim();
		MobileDao dao = new MobileDao(); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the Choice\n1.save\n2.update");
			int ch = sc.nextInt();
		switch(ch) {
		case 1:{
			sim1.setName("Airtel");
			sim1.setProvider("bharthi airtel");
			sim2.setName("bsnl");
			sim2.setProvider("ambani");
			
			List<Sim> sim = Arrays.asList(sim1,sim2);
			mobile.setName("vivo");
			mobile.setModel("vivos1");
			mobile.setSim(sim);
			dao.saveMobileSim(mobile, sim1, sim2);
			break;
		}
		case 2:{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String simname=sc.next();
			System.out.println("enter mbl name");
			String mobilename=sc.next();
			dao.updateById(1, simname, mobilename);
			break;
			
		}
			
			

	}
		}

}
}
