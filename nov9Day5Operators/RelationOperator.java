package com.nov9Day5Operators;

public class RelationOperator {

	public boolean relationOperator(int value1,int value2) {
		boolean result=value1<value2;
		System.out.println(result);
		return result;
	}
	
	public boolean relationOperatorgreater(int value1,int value2) {
		boolean result=value1>=value2;
		System.out.println(result);
		return result;
	}
	
	public boolean relationEqual(int value1,int value2) {
		boolean result=value1==value2;
		System.out.println(result);
		return result;
	}
}
