package com.nov9Day5Operators;

public class Practice {

	public boolean andmethod(int value1,int value2) {
		boolean result=(value1<value2)&(value1++<value2);
		System.out.println(value1);
		System.out.println(result);
		return result;
	}
	

	public boolean andmethod2(int value1,int value2) {
		boolean result=(value1<value2)&&(value1++<value2);
		System.out.println(value1);
		System.out.println(result);
		return result;
	}
}
