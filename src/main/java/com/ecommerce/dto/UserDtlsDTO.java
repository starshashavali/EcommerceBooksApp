package com.ecommerce.dto;

import java.util.List;

import com.ecommerce.domain.Product;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDtlsDTO {

	 private Integer userId;

	    @NotBlank(message = "User name cannot be blank.")
	    private String userName;

	    @Pattern(regexp = "\\d{10}", message = "Phone number must be a 10-digit number.")
	    private String phno;

	    @Email(message = "Invalid email format.")
	    private String email;

	    @Size(min = 6, max = 20, message = "Password length must be between 6 and 20 characters.")
	    private String pwd;
	    
	    @NotEmpty(message = "Role cannot be empty.")
		private String role;
		
	    @NotEmpty(message = "Address cannot be empty.")
	    private String address;
	
		private List<Product> products;

	
//private List<Product> products;
	
	
}
