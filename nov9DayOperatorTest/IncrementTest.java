package com.nov9DayOperatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.IncrementDecrement;

public class IncrementTest {
	
	IncrementDecrement incrementDecrement=new IncrementDecrement();
	
	@AfterEach
	public void afterMethod() {
		System.out.println("aftereach");
	}
	@Test
	public void incrementTest() {
		int result=incrementDecrement.incrementOperator(12);
		assertEquals(13,result);
	}
	

	@Test
	public void decrementTest() {
		double result=incrementDecrement.decrementOperator(10.0,9);
		assertEquals(13,result);
	}
}
