package com.springcore.xml.xonstructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("constructor.xml");
		User user=(User)ac.getBean("u1");
		System.out.println(user.id);
		System.out.println(user.name);

	}

}
