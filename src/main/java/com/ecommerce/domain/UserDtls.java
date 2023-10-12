package com.ecommerce.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_Dtls")
public class UserDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String userName;
	
	private String phno;
	
	private String email;

	private String pwd;
	
	private String role;
	
	private String address;

	@OneToMany
	@JoinColumn(name = "userId_fk")
	private List<Product> products;

}
