package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> getAllProductFromRepository() {
		return productRepository.findAll();
	}
	
	public String storeProdcut(Product product) {
		if(productDao.storeProduct(product)) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String deleteProductInfo(int pid) {
		if(productDao.deleteProduct(pid)) {
			return "Product deleted successfully";
		}else {
			return "Product didn't delete";
		}
	}
}
