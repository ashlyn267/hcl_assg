package org.alvas.hibernate_customer_crud_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.alvas.hibernate_customer_crud_dto.Customer;


public class CustomerDao
	 {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em;
	EntityTransaction et;
	
	
	
	public Customer saveCustomer(Customer customer) {
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		if(customer!=null)
		{
			et.begin();
			em.persist(customer);
			et.commit();
			System.out.println("-----------data stored----------");
			
		}
		else
		{
			System.out.println("please set the data to customer obj");
		}
		return customer;
		
		
		
	}
	
	public Customer updateCustomer(int id,String name,String email)
	{
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		Customer customer2=em.find(Customer.class, id);
		customer2.setName(name);
		customer2.setEmail(email);
		if(customer2!=null)
		{
			et.begin();
			em.merge(customer2);
			et.commit();
			System.out.println("data updated");
			
		}
		else {
			System.out.println("please set data in customer obj");
		}
		
		return customer2;
		
	}
	public Customer deleteCustomerById(int id)
	{
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		Customer customer3=em.find(Customer.class, id);
		if(customer3!=null)
		{
			et.begin();
			em.remove(customer3);
			et.commit();
			System.out.println("deleted");
		}
		else {
			System.out.println("please set data in customer obj");
		}
		
		return null;
		
	}
	public List<Customer> getAllData()
	{
		em=emf.createEntityManager();
		et=em.getTransaction();
		String query="SELECT u FROM Customer u";//dont pass tablename, always pass obj name
		Query query2=em.createQuery(query);
		List<Customer> list=query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+" \n"+a.getName()+"\n "+a.getEmail()));
	
		return null;
		
	}
	public Customer getCustomerByName(String name)
	{
		return null;
		
	}


}
