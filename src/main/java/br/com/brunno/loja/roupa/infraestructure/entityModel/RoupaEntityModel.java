package br.com.brunno.loja.roupa.infraestructure.entityModel;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.brunno.loja.roupa.domain.model.Roupa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "roupa")
public class RoupaEntityModel {

	@Id
	private String sku;
	@ManyToOne
	private Tipo tipo;
	private int qtd_estoque;
	private BigDecimal valor;
	
	public Roupa toRoupa() {
		return new Roupa(
				this.sku,
				this.tipo.getTipo(),
				this.valor,
				this.qtd_estoque
			);
	}
}
