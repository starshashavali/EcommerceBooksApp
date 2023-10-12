package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
