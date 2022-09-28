package br.com.brunno.loja.roupa.domain.service;

import java.util.List;

import br.com.brunno.loja.roupa.domain.model.Roupa;

public interface RoupaService {

	List<Roupa> findAll();
	Roupa findById(String sku);
	Roupa create(Roupa novaRoupa);
	Roupa update(int sku, Roupa roupa);
	
}
