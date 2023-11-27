package com.nov9Day5Operators;

public class IncrementDecrement {
	
	public int incrementOperator(int value1) {
		value1++;
		System.out.println("value1 is "+ ++value1);
		return value1;
	}
	
	public double decrementOperator(double value1,double value2) {
		double result=--value1+value2++- ++value1;
		System.out.println("result is "+ result);
		return value1;
	}

}
