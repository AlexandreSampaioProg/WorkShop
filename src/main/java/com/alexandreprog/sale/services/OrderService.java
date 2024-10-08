package com.alexandreprog.sale.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandreprog.sale.entities.Order;
import com.alexandreprog.sale.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findyByid(Long id) {		
		Optional<Order> obj = repository.findById(id);
		return obj.get();				
	}
	
}
