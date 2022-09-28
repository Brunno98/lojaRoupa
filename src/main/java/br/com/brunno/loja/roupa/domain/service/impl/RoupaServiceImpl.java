package br.com.brunno.loja.roupa.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.brunno.loja.roupa.domain.model.Roupa;
import br.com.brunno.loja.roupa.domain.service.RoupaService;
import br.com.brunno.loja.roupa.infraestructure.entityModel.RoupaEntityModel;
import br.com.brunno.loja.roupa.infraestructure.repository.RoupaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoupaServiceImpl implements RoupaService{

	private final RoupaRepository repository;
	
	@Override
	public List<Roupa> findAll() {
		List<RoupaEntityModel> roupas = repository.findAll();
		List<Roupa> domainRoupas = new ArrayList<>();
		for (RoupaEntityModel roupa : roupas) {
			domainRoupas.add(roupa.toRoupa());
		}
		return domainRoupas;
	}

	@Override
	public Roupa findById(String sku) {
		RoupaEntityModel entity = repository.findById(sku).orElseThrow(() -> new RuntimeException("sku não emcontrado"));
		
		return entity.toRoupa();
	}

	@Override
	public Roupa create(Roupa novaRoupa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roupa update(int sku, Roupa roupa) {
		// TODO Auto-generated method stub
		return null;
	}

}
