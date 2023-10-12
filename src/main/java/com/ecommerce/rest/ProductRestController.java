package com.ecommerce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.IProductService;

import jakarta.validation.Valid;

@RestController
public class ProductRestController {
	@Autowired
	private IProductService iproductService;
	
    @PostMapping("/save")
    public ResponseEntity<?> createProduct(@Valid  @RequestBody ProductDTO productDTO) {
       String saveProduct = iproductService.saveProduct(productDTO);
        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProductById(@Valid @PathVariable Integer id){
    	ProductDTO productId = iproductService.getProductById(id);
    	return ResponseEntity.status(HttpStatus.OK).body(productId);
    }
    @GetMapping("/getAllProducts")
    public ResponseEntity<?> getAllProducts(){
    	 List<ProductDTO> dtos = iproductService.getAllProducts();
    	return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    
    
    
}
