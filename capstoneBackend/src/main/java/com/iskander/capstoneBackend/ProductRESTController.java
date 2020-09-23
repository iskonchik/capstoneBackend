package com.iskander.capstoneBackend;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/iskander/api/v1")
public class ProductRESTController {
	@Autowired
	private ProductRepository productRepository;
	// get all employees
	 @GetMapping("/employees")
	 public List<Product> getAllProduct(Model model) {
	  	
	 return this.productRepository.findAll();
	}
	// get employee by id
	 @GetMapping("/product/{id}")
	 public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long productId)
	   throws ResourceNotFoundException {
	   Product product = productRepository.findById(productId)
	    .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + productId));
	   return ResponseEntity.ok().body(product);
	 }
	// save employee
	 @PostMapping("/employee")
	 public Product createProduct(@Valid @RequestBody Product product) {
		 return productRepository.save(product);
	 }
}