package com.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.domain.Product;
import com.ecommerce.dto.ProductDTO;
import com.ecommerce.exception.IdNotFoundException;
import com.ecommerce.repo.ProductRepo;
import com.ecommerce.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public String saveProduct(ProductDTO productDTO) {
		Product entity = new Product();
		BeanUtils.copyProperties(productDTO, entity);
		productRepo.save(entity);
		return "success";
	}

	@Override
	public ProductDTO getProductById(Integer id) {
		Optional<Product> optional = productRepo.findById(id);
		if (optional.isPresent()) {
			Product product = optional.get();
			ProductDTO dto = new ProductDTO();
			BeanUtils.copyProperties(product, dto);
			return dto;
		}
		throw new IdNotFoundException("Id  not found : " + id);

	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> findAll = productRepo.findAll();
		List<ProductDTO> list = new ArrayList<>();
		for (Product entity : findAll) {
			ProductDTO dto = new ProductDTO();
			BeanUtils.copyProperties(entity, dto);
			list.add(dto);
		}

		return list;
	}

}
