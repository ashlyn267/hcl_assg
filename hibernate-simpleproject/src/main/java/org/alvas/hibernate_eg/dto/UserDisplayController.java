package org.alvas.hibernate_eg.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDisplayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		String query="SELECT u FROM User u";//dont pass tablename, always pass obj name
		Query query2=entityManager.createQuery(query);
		List<User> list=query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+" "+a.getName()+" "+a.getEmail()));
	}

}
