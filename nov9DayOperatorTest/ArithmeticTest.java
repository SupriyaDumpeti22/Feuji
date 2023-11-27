package com.nov9DayOperatorTest;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nov9Day5Operators.ArithmeticOperator;

public class ArithmeticTest {
	
	ArithmeticOperator arithmeticOperator=new ArithmeticOperator();
	
	@Before //will print messege before testcase
	public void beforeMessege() {
		//System.out.println("before testcases");
	}
	
	@BeforeEach//will print messege before every testcase
	public void beforeEachMessege() {
		//System.out.println("beforeEach testcases");
	}
	
	@Test
	public void additionTest() {
		int result=arithmeticOperator.addition(10, 30);
		assertEquals(40,result);//testcase is succes
	}
	@Test
	public void substractionTest() {
		int result=arithmeticOperator.substraction(10, 30);
		assertEquals(-20,result);//testcase is succes
	}
	
	@Test
	public void multiplicationTest() {
		int result=arithmeticOperator.multiplication(10, 30);
		assertEquals(300,result);//testcase is succes
	}
	
	@Test
	public void divisionTest() {
		double result=arithmeticOperator.division(2,10);
		assertEquals(0,result);
	}
	
	@Test
	public void modulerTest() {
		int result=arithmeticOperator.moduler(2,10 );
		assertNotEquals(10, result);
	}



}
