package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf; // it is equal to SessionFactory 
	
	public boolean storeProduct(Product product) {
		try {
			EntityManager manager = emf.createEntityManager();		// it is equal to session object 
			EntityTransaction tran = manager.getTransaction();		// it is equal to Transaction 
			tran.begin();
					manager.persist(product);                      // it is equal to session.save 
			tran.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
}
