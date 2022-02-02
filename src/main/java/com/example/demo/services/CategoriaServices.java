package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categorias;
import com.example.demo.repository.CategoriaRepository;

@Service
public class CategoriaServices {
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaServices(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	public List<Categorias> GetallCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Optional<Categorias> GetCategoria(Long idCategoria){
		return categoriaRepository.findById(idCategoria);
	}
	
	public Categorias addCategoria(Categorias categoria){
		return categoriaRepository.save(categoria);
	}
	
	public Categorias UpdateCategoria(Categorias categoria){
		return categoriaRepository.save(categoria);
	}
	
	public void deleteCategoria(Long idCategoria){
		categoriaRepository.deleteById(idCategoria);

		 
	}


}
