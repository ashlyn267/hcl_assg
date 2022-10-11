package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dto.Teacher;

@Component
public class TeacherDao {
	@Autowired
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public Teacher saveTeacher(Teacher teacher) {
		
		et.begin();
		em.persist(teacher);
		et.commit();
		return teacher;
		
	}
	
	public List<Teacher> getAllData() { 
		  //em = emf.createEntityManager(); 
		  //et = em.getTransaction(); 
		  String select = "Select t from Teacher t"; 
		  Query query =  em.createQuery(select); 
		  List<Teacher> teacher = query.getResultList(); 
		  return teacher; 
		 }
	public Teacher getById(int id) {
		
		return em.find(Teacher.class,id);
		
	}
	
	public Teacher deleteById(int id) {
		
		Teacher teacher1=em.find(Teacher.class, id);
		et.begin();
		em.remove(teacher1);
		et.commit();
		return teacher1;
		
	}
	
	public Teacher updateTeacher(Teacher teacher) {
		Teacher t1=em.find(Teacher.class,teacher.getId());
		et.begin();
		em.merge(teacher);
		et.commit();
		return t1;
		
	}

}
