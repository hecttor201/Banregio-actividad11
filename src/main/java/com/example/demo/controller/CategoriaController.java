package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categorias;
import com.example.demo.services.CategoriaServices;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {
	private CategoriaServices categoriaServices;
	
	public CategoriaController(CategoriaServices categoriaServices) {
		this.categoriaServices = categoriaServices;
				
	}
	@CrossOrigin
	@ApiOperation("Obtiene todas las categorias")
	@GetMapping
	public ResponseEntity<List<Categorias>> getallCategorias(){
		try {
			return ResponseEntity.ok(categoriaServices.GetallCategorias());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@ApiOperation("Obtiene una categoria por su id")
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Optional<Categorias>> getCategoria(@PathVariable ("idCategoria") Long idCategoria){
		try {
			return ResponseEntity.ok(categoriaServices.GetCategoria(idCategoria));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@ApiOperation("Agrega una nueva categoria")
	@PostMapping
	public ResponseEntity<Categorias> agregarCategoria(@RequestBody Categorias categoria){
		try {
			return ResponseEntity.ok(categoriaServices.addCategoria(categoria));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@ApiOperation("Actualiza una categoria")
	@PutMapping
	public ResponseEntity<Categorias> actualizarCategoria(@RequestBody Categorias categoria){
		try {
			return ResponseEntity.ok(categoriaServices.UpdateCategoria(categoria));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@CrossOrigin
	@ApiOperation("Elimina una categoria")
	@DeleteMapping("/{idCategoria}")
	public ResponseEntity<Void> eliminarCategoria(@PathVariable ("idCategoria") Long idCategoria){
		try {
			categoriaServices.deleteCategoria(idCategoria);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
