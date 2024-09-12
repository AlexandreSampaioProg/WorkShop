package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.OrderItem;
import com.alexandreprog.sale.entities.pk.OrderItemPK;



//ele herda as anotaçoes do spring
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
