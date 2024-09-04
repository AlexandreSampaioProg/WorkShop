package com.alexandreprog.sale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreprog.sale.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
