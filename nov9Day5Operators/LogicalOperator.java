package com.nov9Day5Operators;

public class LogicalOperator {

	public boolean logicalAnd(int value1, double value2) {

		boolean result = (value1 > value2) && (value1++ == value2);
		System.out.println(value1);

		System.out.println(result);
		return result;
	}

	public boolean logicalOr(int value1, double value2) {

		boolean result = (value1 > value2) || (value1 == value2);
		System.out.println(value1);

		System.out.println(result);
		return result;
	}
	
	public boolean logicalNot(int value1, double value2) {

		boolean result = (!(value1 > value2) || (value1 == value2));
		System.out.println(value1);

		System.out.println(result);
		return result;
	}
}
