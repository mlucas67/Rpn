package com.om.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class NewRpnCalculatorShould {

	private RpnCalculator calculator;

	@Before
	public void init() {
		calculator = new RpnCalculator();
	}
	
	@Test
	public void HaveZeroAsItsAccumulator() {
		assertEquals( BigDecimal.ZERO, calculator.getAccumulator() );
	}
	
	@Test
	public void AllowItsAccumulatorToBeSet() {
		BigDecimal value = new BigDecimal( 42 );
		calculator.setAccumulator( value );
		assertEquals( value, calculator.getAccumulator() );
	}

	@Test
	public void NotThrowAnExceptionWhenDropCalled() {
		calculator.drop();
	}
	
}
