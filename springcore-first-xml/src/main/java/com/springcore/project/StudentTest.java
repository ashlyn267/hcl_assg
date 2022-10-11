package com.springcore.project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory bf =new ClassPathXmlApplicationContext("myfriend.xml");
		
		Student stud=(Student)bf.getBean("s1");
		stud.getStudent();
	}

}
