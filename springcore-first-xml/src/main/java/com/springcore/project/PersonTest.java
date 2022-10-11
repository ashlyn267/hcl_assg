package com.springcore.project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory bf =new ClassPathXmlApplicationContext("myPerson.xml");
		
		Person person=(Person)bf.getBean("p1");
		person.getPerson();

	}

}
