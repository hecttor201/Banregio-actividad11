package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categorias;

public interface CategoriaRepository extends JpaRepository<Categorias, Long>{

}
