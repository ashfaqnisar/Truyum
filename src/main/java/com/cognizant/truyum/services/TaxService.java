package com.cognizant.truyum.services;

import com.cognizant.truyum.models.UserClaim;
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
