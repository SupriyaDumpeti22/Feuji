package com.nov9DayOperatorTest;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.Practice;

public class PracticeTest {
	
	Practice practice=new Practice();
	
	@Before
	public void beforeMethod() {
	//	System.out.println("before");
	}

	@Test
	public void  practiceTest() {
		boolean result=practice.andmethod(100, 20);
		assertTrue(result);
	}
	
	@Test
	public void  practiceTest2() {
		boolean result=practice.andmethod2(100, 20);
		assertTrue(result);
	}
}
