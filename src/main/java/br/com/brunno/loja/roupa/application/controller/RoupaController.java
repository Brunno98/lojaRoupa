package br.com.brunno.loja.roupa.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunno.loja.roupa.domain.model.Roupa;
import br.com.brunno.loja.roupa.domain.service.RoupaService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/roupa")
public class RoupaController {

	private final RoupaService service;
	
	@GetMapping
	public ResponseEntity<List<Roupa>> getAll() {
		List<Roupa> roupas = service.findAll();
		
		return ResponseEntity.ok(roupas);
	}
	
	@GetMapping("{sku}")
	public ResponseEntity<Roupa> getBySku(@PathVariable String sku) {
		Roupa roupa = service.findById(sku);
		
		return ResponseEntity.ok(roupa);
	}
}
