package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.dto.Product;
import com.infosys.repository.ProductRepository;

@Service
public class ProductServiceImpl {
    @Autowired
    ProductRepository repo;
    
    public Iterable<Product> getProducts() {
    	Iterable<Product> prds = repo.findAll();
    	return prds;
   
    }
    
    public Product getProduct(int id) {
    	return repo.findById(id).get();
    }
    
    public Product addProduct(Product p) {
    	repo.save(p);
    	return p;
    }
    
    public Product modProduct(Product p) {
    	if(repo.existsById(p.getProductId()))
    	{
    		repo.save(p);
    		return p;
    	}
    	else
    		return null;
    
    }
    
    public Product delProduct(int id) {
    	if(repo.existsById(id))
       
    		
    	{
    		Product p =repo.findById(id).get();
    		repo.deleteById(id);
    	    return p;
    	}
  
        else
    	return null;
    }

}
