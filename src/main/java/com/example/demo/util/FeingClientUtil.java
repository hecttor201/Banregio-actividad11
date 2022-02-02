package com.example.demo.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Productos;

@FeignClient(value="feingDemo", url="http://localhost:8080/Producto")
public interface FeingClientUtil {
	
	@GetMapping("/")
	List<Productos> getallproductos();

}
