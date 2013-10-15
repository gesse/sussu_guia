package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import play.data.validation.Constraints;

@Entity
@SequenceGenerator(name="bar_sequence", sequenceName="sequence_bar")
public class Bar {

    @Id
    @GeneratedValue(generator="bar_sequence", strategy=GenerationType.SEQUENCE)
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