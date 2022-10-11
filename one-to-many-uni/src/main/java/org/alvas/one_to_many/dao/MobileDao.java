package org.alvas.one_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Mobile saveMobileSim(Mobile mobile, Sim sim1,Sim sim2) {
		
		 et.begin();
		 em.persist(mobile);
		 em.persist(sim1);
		 em.persist(sim2);
		 et.commit();
		return mobile;
	}

	public Mobile updateById(int id,String simname,String mobilename)
	{
		
		Mobile mobile1=em.find(Mobile.class, id);
		et.begin();
		mobile1.setName(mobilename);
		List<Sim> sim1= mobile1.getSim();
		
		for(Sim sim:sim1) {
		if(sim.getName().equals("VI")) { 
			//for vi create one variable and pass it inside method and compare within equals
			sim.setName(simname);
			em.merge(sim);
		}
		}
		//concurrent exception occurs when we try to store list values in one obj
		em.merge(mobile1);
		et.commit();
		
		
		return null;
		
	}
	

}
