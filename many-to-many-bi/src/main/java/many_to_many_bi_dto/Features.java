package many_to_many_bi_dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Features {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feautureId;
	@CreationTimestamp
	
	private LocalDateTime dateTime;
	
	private String featureName;
	
	@ManyToMany
	@JoinTable(name="car_name_id", joinColumns=@JoinColumn(name="car_feature_id"),
	inverseJoinColumns = @JoinColumn(name="cars_id"))
	List<Car> cars;

	public int getFeautureId() {
		return feautureId;
	}

	public void setFeautureId(int feautureId) {
		this.feautureId = feautureId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	

}
