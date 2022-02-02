package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Productos;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoServices {
	
	private ProductoRepository productoRepository;
	
	@Autowired
	public ProductoServices(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	public List<Productos> GetallProductos(){
		return productoRepository.findAll();
	}
	
	public Optional<Productos> GetProducto(Long idProducto){
		return productoRepository.findById(idProducto);
	}
	
	public Productos addProducto(Productos producto){
		return productoRepository.save(producto);
	}
	
	public Productos UpdateProducto(Productos producto){
		return productoRepository.save(producto);
	}
	
	public void deleteProducto(Long idProducto){
		productoRepository.deleteById(idProducto);
	}

}
