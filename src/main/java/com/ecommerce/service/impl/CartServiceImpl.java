package com.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.domain.Cart;
import com.ecommerce.domain.Product;
import com.ecommerce.dto.CartDTO;
import com.ecommerce.repo.CartRepo;
import com.ecommerce.repo.ProductRepo;
import com.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo cartRepo;

	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean addCart(CartDTO cartDTO) {
		Optional<Cart> cart = cartRepo.findById(cartDTO.getUser().getUserId());
		List<Product> products = new ArrayList<>();
		for (Product productentity : cartDTO.getProducts()) {
			products.add(productentity);
		}
		cartDTO.setProducts(products);
		
		return true;

		// throw new InsufficientStockException("Insufficient stock for the product");
	}

}
