package com.org.many_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.org.many_to_one.dto.Building;
import com.org.many_to_one.dto.College;

public class CollegeDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Building saveBuildingCollege(College college,Building building1,Building building2)
	{
		
		et.begin();
		//em.persist(college);
		// we use cascade so tht we can persist college data without iusing persist method
		em.persist(building1);
		em.persist(building2);
		et.commit();
		return building2;
		
	}
	public Building delBuilding(College college ,Building building1,Building building2)
	{
		
		et.begin();
		
		return building2;
		
	}

}
