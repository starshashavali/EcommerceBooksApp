package com.ecommerce.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDTO {

	@NotBlank(message = "Product name cannot be blank.")
    private String productName;

    @NotBlank(message = "Description cannot be blank.")
    private String description;

    @NotNull(message = "Price cannot be null.")
    @DecimalMin(value = "0.0", message = "Price must be greater than or equal to 0.0")
    private Double price;

}
