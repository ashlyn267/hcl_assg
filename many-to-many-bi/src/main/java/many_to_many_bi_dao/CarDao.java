package many_to_many_bi_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_bi_dto.Car;
import many_to_many_bi_dto.Features;

public class CarDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public List<Car> saveCar(List<Car> cars,List<Features> features) { 
		et.begin();
		for(Features feature :features ) {
			em.persist(feature);
		}
		
		for(Car car:cars) {
			em.persist(car);
		}
		et.commit();
		return cars;
	
		
	}
	
	

}
