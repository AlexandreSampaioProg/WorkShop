package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
