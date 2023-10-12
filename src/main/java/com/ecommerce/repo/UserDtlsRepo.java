package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.UserDtls;

public interface UserDtlsRepo extends JpaRepository<UserDtls, Integer>{
	UserDtls findByEmail(String email);
	UserDtls findByEmailAndPwd(String email,String pwd);
	

}
