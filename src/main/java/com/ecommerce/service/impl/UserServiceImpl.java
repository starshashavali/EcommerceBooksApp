package com.ecommerce.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.domain.UserDtls;
import com.ecommerce.dto.LoginDTO;
import com.ecommerce.dto.UserDtlsDTO;
import com.ecommerce.exception.DuplicateEmailException;
import com.ecommerce.exception.EmailNotFoundException;
import com.ecommerce.repo.UserDtlsRepo;
import com.ecommerce.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserDtlsRepo userDtlsRepo;

	@Override
	public String saveUser(UserDtlsDTO userDtlsDTO) {
		UserDtls userDtls = userDtlsRepo.findByEmail(userDtlsDTO.getEmail());
		if (userDtls != null) {
			throw new DuplicateEmailException("Duplicate Email exception...");
		}
		UserDtls entity = new UserDtls();
		BeanUtils.copyProperties(userDtlsDTO, entity);
		/*
		 * //PasswordEncoder encoder = new BCryptPasswordEncoder(); String pwd =
		 * encoder.encode(userDtlsDTO.getPwd()); entity.setPwd(pwd);
		 */
		userDtlsRepo.save(entity);
		return "success";
	}

	public String loadUserByUsername(LoginDTO dto) {
		UserDtls userEntity = userDtlsRepo.findByEmailAndPwd(dto.getEmail(), dto.getPwd());
		if (userEntity == null) {
			throw new EmailNotFoundException("Email not found...");
		}
		return "Login success";

	}

}
