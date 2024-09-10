package com.alexandreprog.sale.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandreprog.sale.entities.Category;
import com.alexandreprog.sale.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findyByid(Long id) {		
		Optional<Category> obj = repository.findById(id);
		return obj.get();				
	}
	
}
