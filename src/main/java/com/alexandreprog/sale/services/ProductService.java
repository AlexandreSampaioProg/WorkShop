package com.alexandreprog.sale.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandreprog.sale.entities.Product;
import com.alexandreprog.sale.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findyByid(Long id) {		
		Optional<Product> obj = repository.findById(id);
		return obj.get();				
	}
	
}
