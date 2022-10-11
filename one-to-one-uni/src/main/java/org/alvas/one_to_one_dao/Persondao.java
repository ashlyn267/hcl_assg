package org.alvas.one_to_one_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.alvas.one_to_one.dto.Aadhar;
import org.alvas.one_to_one.dto.Person;

public class Persondao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Person savePerson(Person person,Aadhar aadhar) {
		et.begin();
		em.persist(aadhar);
		em.persist(person);
		et.commit();
		
		return person;
		
	}
	
	public Person getPersonAadhar(int id) {
		Person person=em.find(Person.class, id);
		return person;
	}
	
	public Person deleteById(int id)
	{
		Person person = em.find(Person.class, id);
		Aadhar aadhar=em.find(Aadhar.class,person.getAadhar().getId());
		et.begin();
		em.remove(person);
		em.remove(aadhar);
		et.commit();
		return person;
		
	}
	public Person updatePerson(int id,String name,long ano) {
		Person person=em.find(Person.class, id);
		Aadhar aadhar=em.find(Aadhar.class,person.getAadhar().getId());
		person.setName(name);
		aadhar.setAno(ano);
		et.begin();
		em.merge(person);
		em.merge(aadhar);
		et.commit();
		return person;
		
	}
}
