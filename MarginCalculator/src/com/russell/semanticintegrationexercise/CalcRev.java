package com.russell.semanticintegrationexercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcRev implements RevenueCalculator {

	@Override
	public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
		
		if (marginPercentage.equals(BigDecimal.valueOf(100))) {
			//Returns zero as division by zero
			return BigDecimal.ZERO;
		} else {
			return (costOfGoods.divide(BigDecimal.ONE.subtract(marginPercentage.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)), 2, RoundingMode.HALF_UP));
		}
		
	}

}
