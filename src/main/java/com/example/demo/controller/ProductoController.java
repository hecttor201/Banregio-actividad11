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

import com.example.demo.model.Productos;
import com.example.demo.services.ProductoServices;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/Producto")
public class ProductoController {
private ProductoServices ProductoServices;
	
	public ProductoController(ProductoServices ProductoServices) {
		this.ProductoServices = ProductoServices;
				
	}
	@CrossOrigin
	@ApiOperation("Obtener todos los productos")
	@GetMapping
	public ResponseEntity<List<Productos>> getallProductos(){
		try {
			return ResponseEntity.ok(ProductoServices.GetallProductos());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@CrossOrigin
	@ApiOperation("Obtener un producto por el id")
	@GetMapping("/{idProducto}")
	public ResponseEntity<Optional<Productos>> getProducto(@PathVariable ("idProducto") Long idProducto){
		try {
			return ResponseEntity.ok(ProductoServices.GetProducto(idProducto));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@ApiOperation("Agrega un nuevo producto")
	@PostMapping
	public ResponseEntity<Productos> agregarProducto(@RequestBody Productos productos){
		try {
			return ResponseEntity.ok(ProductoServices.addProducto(productos));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@ApiOperation("Actualiza un productos")
	@PutMapping
	public ResponseEntity<Productos> actualizarCategoria(@RequestBody Productos productos){
		try {
			return ResponseEntity.ok(ProductoServices.UpdateProducto(productos));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@CrossOrigin
	@ApiOperation("Elimina un producto")
	@DeleteMapping("/{idCategoria}")
	public ResponseEntity<Void> eliminarCategoria(@PathVariable ("idCategoria") Long idProducto){
		try {
			ProductoServices.deleteProducto(idProducto);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
}
