package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.ConfirmationOtp;

public interface ConfirmationOtpRepository extends JpaRepository<ConfirmationOtp, Long>{

	ConfirmationOtp findByOtpNumber (Integer otpNumber);
	ConfirmationOtp findByUserUserid(Long userId);
	
}
