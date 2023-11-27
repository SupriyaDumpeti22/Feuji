package com.nov9Day5Operators;

public class ArithmeticOperator {
	
	public int addition(int value1,int value2) {
		int result=value1+value2;
		System.out.println(result);
		return result;
	}
	
	public int substraction(int value1,int value2) {
		int result=value1-value2;
		System.out.println(result);
		return result;
	}
	public int multiplication(int value1,int value2) {
		int result=(value1*value2)+value1/value2;
		System.out.println(result);
		return result;
	}

	public double division(int value1,int value2) {
		double result=value1/value2;
		System.out.println(result);
		return result;
	}
	public int moduler(int value1,int value2) {
		int result=value1%value2;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {

		ArithmeticException arithmeticException=new ArithmeticException();
	}

}
