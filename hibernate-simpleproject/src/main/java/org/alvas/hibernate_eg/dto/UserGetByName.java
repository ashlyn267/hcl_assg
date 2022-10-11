package org.alvas.hibernate_eg.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserGetByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		String query="SELECT u FROM User u where u.name=?1";
		Query query2=em.createQuery(query);
		query2.setParameter(1,"josna");
		
		List<User> list =query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+" \n"+a.getName()+"\n"+a.getEmail()));
		
		

	}

}
