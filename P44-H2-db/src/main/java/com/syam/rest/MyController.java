package com.syam.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syam.entity.Product;
import com.syam.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		String msg = myService.addProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}


	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getAllStudents() {
		List<Product> allProduct = myService.listAllProduct();
		return new ResponseEntity<>(allProduct, HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Product product) {
		String msg = myService.addProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		String del=myService.deleteProduct(id);
		return new ResponseEntity<>(del, HttpStatus.OK);
	}
}
