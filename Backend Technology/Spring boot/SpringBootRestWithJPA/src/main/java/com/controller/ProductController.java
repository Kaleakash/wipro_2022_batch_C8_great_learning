package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/storeProduct
	@RequestMapping(value = "storeProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.POST)
	public String storeProduct(@RequestBody Product product) {
			return productService.storeProdcut(product);
	}
}
