package com.ecommerce.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Product_Dtls")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer productId;

	private String productName;

	private String description;

	private Double price;
	
	

}
