package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
