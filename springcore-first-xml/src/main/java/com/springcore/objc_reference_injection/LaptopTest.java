package com.springcore.objc_reference_injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("objref.xml");
		Laptop laptop=(Laptop)ac.getBean("ul1");
		laptop.getLaptop();

	}

}
