package one_to_one_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_one_bi_dto.Pan;
import one_to_one_bi_dto.Person;

public class PersonDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public Person savePerson(Person person,Pan pan)
	{
		
		et.begin();
		em.persist(pan);
		em.persist(person);
		et.commit();
		return person;
		
	}
	
	public Person getById(int personId)
	{
		Person person=em.find(Person.class, personId);
		return person;
		
	}
	
	public Person delById(int personId)
	{
		Person person=em.find(Person.class, personId);
		Pan pan=em.find(Pan.class, person.getPan().getPanId());
		et.begin();
		em.remove(person);
		em.remove(pan);
		et.commit();
		
		return null;
		
	}
}
