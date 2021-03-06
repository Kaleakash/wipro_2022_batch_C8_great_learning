package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("products")	// http://localhost:8080/products/
@CrossOrigin			// Enable cors policies 
public class ProductController {

	@Autowired
	ProductService productService;
	
	//@RequestMapping(value = "findAll",method = )
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct() {
		return productService.findAllProduct();
	}
	
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProdcut(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping(value = "deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
	
	@GetMapping(value = "findProductById/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProductById(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
	
	@GetMapping(value = "findProductByPrice/{price}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findProductByPrice(@PathVariable("price") float price){
		return productService.findProductByPrice(price);
	}
	

	@GetMapping(value = "sortProductByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> sortProductByPrice(){
		return productService.sortProductByPrice();
	}
	
	@DeleteMapping(value = "deleteProductByName/{pname}")
	public String deleteProductByName(@PathVariable("pname") String pname) {
		return productService.deleteProductByName(pname);
	}
	
}





