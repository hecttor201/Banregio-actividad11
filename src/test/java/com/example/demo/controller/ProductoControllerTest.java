package com.example.demo.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Productos;

@SpringBootTest
class ProductoControllerTest {

	@Autowired
	ProductoController productoController;
	
	@Test
	public void buscarProductos() {
		ResponseEntity<List<Productos>> pruducto;
		pruducto = productoController.getallProductos();
		assertNotNull(pruducto);
	}
	
	@Test
	public void ingresarProducto() {
		Productos pruducto=new Productos();
		pruducto.setPro_IdProd((long) 3);
		pruducto.setPro_Nombre("Activdad 12");
		pruducto.setPro_NumTra("qwe123");	
		pruducto.setPro_Transa("qweasd");
		pruducto.setPro_Usuari("pruebas");
		pruducto.setPro_FecSis("2022/02/03");
		pruducto.setPro_SucOri("HMO");
		pruducto.setPro_SucDes("OBR");		
		productoController.agregarProducto(pruducto);
		
		
	}
	
	@Test
	public void modificarProducto() {
		Productos pruducto=new Productos();
		pruducto.setPro_IdProd((long) 3);
		pruducto.setPro_Nombre("Activdad 12");
		pruducto.setPro_NumTra("123");	
		pruducto.setPro_Transa("Actualiza");
		pruducto.setPro_Usuari("Hector");
		pruducto.setPro_FecSis("2022/02/04");
		pruducto.setPro_SucOri("OBR");
		pruducto.setPro_SucDes("HMO");		
		productoController.actualizarProducto(pruducto);
		
	}
	
	@Test
	public void deleteProducto() {
		productoController.eliminarProducto((long) 3);
		
	}
}
