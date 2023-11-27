package com.nov10day6Test_Practice;

public class TernaryOperator {
	public void ternary() {
		int x=3;
		int y=~x;
		int z;
		z=x>y?x:y;
		System.out.println(z);
	}

	public static void main(String[] args) {

//		int value1=10;
//		int value2=20;
//		int value3=30;
//		int value4=40;
//		System.out.println(value1<value2?value4>value3?"hai":"hello":"false");
		TernaryOperator ternaryOperator=new TernaryOperator();
		ternaryOperator.ternary();

	}

}
