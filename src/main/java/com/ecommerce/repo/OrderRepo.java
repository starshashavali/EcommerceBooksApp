package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
