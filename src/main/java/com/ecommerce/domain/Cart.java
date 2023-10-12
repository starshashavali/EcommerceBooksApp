package com.ecommerce.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	
	private Integer qty;

    private Date createdDate;

    private Date updatedDate;
	
	  @OneToOne 
	    @JoinColumn(name = "user_id")
	    private UserDtls user;

	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "cart_product",
	        joinColumns = @JoinColumn(name = "cart_id"),
	        inverseJoinColumns = @JoinColumn(name = "product_id")
	    )
	    private List<Product> products;

	}


