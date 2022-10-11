package many_to_many_bi_controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import many_to_many_bi_dao.CarDao;
import many_to_many_bi_dto.Car;
import many_to_many_bi_dto.Features;

public class CarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDao dao=new CarDao();
		Car car1=new Car();
		Car car2=new Car();
		Features feature1=new Features();
		Features feature2=new Features();
		
		car1.setCarName("nano");
		car1.setCarPrice(100000);
		car2.setCarName("swift");
		car2.setCarPrice(400000);
		
		List<Car> cars=Arrays.asList(car1,car2);
		feature1.setFeatureName("ac");
		feature2.setFeatureName("music");
		
		List<Features> features=Arrays.asList(feature1,feature2);
		car1.setFeatures(features);
		car2.setFeatures(features);
		
		feature1.setCars(cars);
		feature2.setCars(cars);
		
		dao.saveCar(cars, features);
		
		
		
		

	}

}
