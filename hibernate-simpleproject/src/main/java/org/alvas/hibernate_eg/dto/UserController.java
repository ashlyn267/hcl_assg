package org.alvas.hibernate_eg.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=new User();
		user.setId(110);
		user.setName("saqib star");
		user.setEmail("smileyman@gmail.com");
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		

	}

}
