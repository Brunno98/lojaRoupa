package br.com.brunno.loja.roupa.infraestructure.entityModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Tipo {
	
	@Id
	private int id;
	private String tipo;
	
}
