package com.nov9DayOperatorTest;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.RelationOperator;

public class RelationTest {
	
	RelationOperator relationOperator=new RelationOperator();
	
	@Before
	public void before() {
		System.out.println("testing");
	}
	@Test
	public void relationTest() {
		boolean result=relationOperator.relationOperator(10, 20);
		assertTrue(result);
	}
	
	@Test
	public void relationTestGreater() {
		boolean result=relationOperator.relationOperatorgreater(10, 20);
		assertTrue(result);
	}
	
	@Test
	public void relationTestEqual() {
		boolean result=relationOperator.relationEqual(10, 20);
		assertTrue(result);
	}
	


}
