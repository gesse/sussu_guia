package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	public Long id;
	
	@Constraints.Required(message="O campo descrição é de preenchimento obrigatório")
	public String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
