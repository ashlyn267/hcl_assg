package org.alvas.autogeneratedid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee st= new Employee();
		//st.setId(101);
		st.setName("ashlyn");
		st.setEmail("ashlyndcosta93@gmail.com");
		
		
		et.begin();
		em.persist(st);
		et.commit();
		

	}

}