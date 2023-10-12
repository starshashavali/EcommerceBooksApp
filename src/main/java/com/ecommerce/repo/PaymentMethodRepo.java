package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.PaymentMethod;

public interface PaymentMethodRepo extends JpaRepository<PaymentMethod, Integer> {

}
