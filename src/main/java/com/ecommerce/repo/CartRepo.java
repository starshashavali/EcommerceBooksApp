package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
