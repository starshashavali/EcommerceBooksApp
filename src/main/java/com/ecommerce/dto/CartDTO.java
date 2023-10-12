package com.ecommerce.dto;

import java.util.Date;
import java.util.List;

import com.ecommerce.domain.Product;
import com.ecommerce.domain.UserDtls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
	private Integer cartId;

	private Integer qty;

	private Date createdDate;

	private Date updatedDate;

	private UserDtls user;

	private List<Product> products;

}
