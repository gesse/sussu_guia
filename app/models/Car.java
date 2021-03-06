package models;

import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="car_sequence", sequenceName="sequence_car")
public class Car {

    @Id
    @GeneratedValue(generator="car_sequence", strategy=GenerationType.SEQUENCE) 
    public Long id;

    @Constraints.Required(message = "O nome é obrigatório")
    public String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}