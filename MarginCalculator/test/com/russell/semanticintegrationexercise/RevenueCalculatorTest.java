package com.russell.semanticintegrationexercise;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class RevenueCalculatorTest {

	@Test
	public void testRevenueCalculator() {
		RevenueCalculator revenueCalculator = new CalcRev();
		
		//When the Margin Percentage is 0%
		assertEquals("Result", BigDecimal.valueOf(400).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.ZERO, BigDecimal.valueOf(400)));

		//When the Margin Percentage are normal values (20% and 90%)
		assertEquals("Result", BigDecimal.valueOf(500.00).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.valueOf(20), BigDecimal.valueOf(400)));
		assertEquals("Result", BigDecimal.valueOf(4000.00).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.valueOf(90), BigDecimal.valueOf(400)));
		
		//When the Margin Percentage is 100%
		assertEquals("Result", BigDecimal.ZERO, revenueCalculator.calculateRevenue(BigDecimal.valueOf(100), BigDecimal.valueOf(400)));
		
		//When the Margin Percentage is over 100% and below 0%
		assertEquals("Result", BigDecimal.valueOf(-4000.00).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.valueOf(110), BigDecimal.valueOf(400)));
		assertEquals("Result", BigDecimal.valueOf(266.67).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.valueOf(-50), BigDecimal.valueOf(400)));

		//When the Cost of Goods is 0, revenue will always be 0
		assertEquals("Result", BigDecimal.valueOf(0).setScale(2), revenueCalculator.calculateRevenue(BigDecimal.valueOf(50), BigDecimal.ZERO));
	}

}
