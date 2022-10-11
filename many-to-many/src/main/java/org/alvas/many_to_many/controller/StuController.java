package org.alvas.many_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.many_to_many.dao.StudentDao;
import org.alvas.many_to_many.dto.Student;
import org.alvas.many_to_many.dto.Subjects;


public class StuController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDao dao=new StudentDao();
		
		Subjects sub1=new Subjects();
		Subjects sub2=new Subjects();
		Student st1=new Student();
		Student st2=new Student();
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Choice\n1.save\n2.update");
			int ch = sc.nextInt();
		switch(ch) {
		case 1:{
			List<Subjects> subjects =Arrays.asList(sub1,sub2);
			sub1.setSname("wta");
			sub1.setSauthor("badhusha");
			sub2.setSname("cgv");
			sub2.setSauthor("pranitha");
			
		
			
			st1.setStname("ashlyn");
			st1.setStphone(72598979);
			st2.setStname("amisha");
			st2.setStphone(99459370);
			
			dao.saveStudent(st1, st2, subjects);
		}
		}
		

	}

}
}
