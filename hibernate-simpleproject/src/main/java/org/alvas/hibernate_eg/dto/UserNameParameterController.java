package org.alvas.hibernate_eg.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class UserNameParameterController {
	
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		String query ="SELECT u FROM User u where u.email=:name";
		Query query2=em.createQuery(query);
		query2.setParameter("name","anithadcosta@gmail.com");
		List<User> list =query2.getResultList();
		
		list.forEach(a->System.out.println(a.getId()+" \n"+a.getName()+"\n"+a.getEmail()));
		
		
	}

}
