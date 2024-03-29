package com.om.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class OperandStackTest {
	OperandStack values;
	
	@Before
	public void init() {
		values = new OperandStack();
	}
	
	@Test
	public void IsNeverEmpty() {
		assertEquals( BigDecimal.ZERO, values.peek() );
	}
	
	@Test
	public void CanReplaceTopValue() {
		values.replaceTop( BigDecimal.TEN );
		assertEquals( BigDecimal.TEN, values.peek() );
	}
	
	@Test
	public void CanHaveValuesPushed() {
		values.push( BigDecimal.ONE );
		assertEquals( BigDecimal.ONE, values.peek() );
	}
	
	@Test
	public void TopValueRemovedOnPop() {
		values.replaceTop( new BigDecimal(19) );
		values.pop();
		assertEquals( BigDecimal.ZERO, values.peek() );
	}
	
	@Test
	public void PopCanBeCalledOnEmptyStack() {
		values.pop();
	}
	
}
