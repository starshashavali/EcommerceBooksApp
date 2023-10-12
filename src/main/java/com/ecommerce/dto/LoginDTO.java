package com.ecommerce.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class LoginDTO {
	
    @Email(message = "Invalid email format.")
    private String email;

    @Size(min = 6, max = 20, message = "Password length must be between 6 and 20 characters.")
    private String pwd;

}
