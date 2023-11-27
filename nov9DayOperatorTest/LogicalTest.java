package com.nov9DayOperatorTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.LogicalOperator;

public class LogicalTest {
	
	LogicalOperator logicalOperator=new LogicalOperator();
	
	@Test
	public void logicalAnd() {
		
		boolean result=logicalOperator.logicalAnd(24, 24.0);
		assertFalse(result);
	}
	
	@Test
	public void logicalOr() {
		
		boolean result=logicalOperator.logicalAnd(24, 24.0);
		assertFalse(result);
	}
	
	@Test
	public void logicalNot() {
		
		boolean result=logicalOperator.logicalNot(24, 24.0);
		assertTrue(result);
	}


}
