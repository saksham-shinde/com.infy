package com.infosys.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.dto.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
