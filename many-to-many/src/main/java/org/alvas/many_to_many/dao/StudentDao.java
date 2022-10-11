package org.alvas.many_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_many.dto.Student;
import org.alvas.many_to_many.dto.Subjects;

public class StudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public Student saveStudent(Student st1,Student st2,List<Subjects> list)
	{
		
		et.begin();
		em.persist(st1);
		em.persist(st2);
		for(Subjects subject :list) {
			em.persist(subject);
		}
		et.commit();
		return st1;
		
	}

}
