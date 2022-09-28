package br.com.brunno.loja.roupa.domain.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Roupa {

	private final String sku;
	private final String tipo;
	private final BigDecimal preco;
	private final int qtdEstoque;

}
