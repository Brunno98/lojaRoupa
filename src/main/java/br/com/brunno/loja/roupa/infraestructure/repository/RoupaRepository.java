package br.com.brunno.loja.roupa.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunno.loja.roupa.infraestructure.entityModel.RoupaEntityModel;

public interface RoupaRepository extends JpaRepository<RoupaEntityModel, String> {

}
