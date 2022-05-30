package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public String storeProduct(Product product) {
			boolean result = productRepository.existsById(product.getPid());
			if(result) {
				return "Product didn't store Pid must be unique";
			}else {
				productRepository.save(product);
				return "Product stored successfully";
			}
	}
	
}
