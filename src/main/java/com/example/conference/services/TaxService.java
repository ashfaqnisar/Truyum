package com.example.conference.services;

import com.example.conference.models.UserClaim;
import org.springframework.stereotype.Service;

@Service
public interface TaxService {
	/**
	 * Calculate Tax
	 *
	 * @param userClaim UserClaim bean
	 * @return Calculated tax
	 */
	public double calculateTax(UserClaim userClaim);
}
