package com.ecommerce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.UserDtlsDTO;
import com.ecommerce.service.IUserService;

import jakarta.validation.Valid;

@RestController
@Valid
public class UserRestController {

	@Autowired
	private IUserService iuserService;

	@PostMapping("/user/registration")
	public ResponseEntity<?> createProduct(@Valid @RequestBody UserDtlsDTO userDtlsDTO) {
		String saveUser = iuserService.saveUser(userDtlsDTO);
		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	}
	

}
