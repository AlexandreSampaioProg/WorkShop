package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.User;

//ele herda as anotaçoes do spring
public interface UserRepository extends JpaRepository<User, Long>{
	
}
