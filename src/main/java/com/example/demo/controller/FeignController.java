package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Productos;
import com.example.demo.util.FeingClientUtil;

@RestController
@RequestMapping("/feing")
public class FeignController {

	@Autowired
	private FeingClientUtil feingClientUtil;
	
	@GetMapping
	public ResponseEntity<List<Productos>> getallProductos(){
		return ResponseEntity.ok(feingClientUtil.getallproductos());
	}
}
