package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ProductDTO;

public interface IProductService {

	public String saveProduct(ProductDTO productDTO);

	public ProductDTO getProductById(Integer id);

	public List<ProductDTO> getAllProducts();

}
