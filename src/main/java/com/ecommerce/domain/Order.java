package com.ecommerce.domain;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Order_Dtls")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;

	@CreationTimestamp
	private Date date;

	@OneToOne
	@JoinColumn(name = "userId_fk")
	private UserDtls userDtls;

	@OneToMany
	@JoinColumn(name = "orderId_fk")
	private List<Product> products;

	@OneToOne
	@JoinColumn(name = "paymentId_fk")
	private PaymentMethod payment;

}
