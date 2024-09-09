package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.Order;


//ele herda as anotaçoes do spring
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
