package com.Nov24Day15StringClassAssignment;

public class PrimitiveDataToString_12 {
	public void primitive() {
		
		int value=100;
		String name=Integer.toString(value);
		System.out.println(name.toLowerCase());//converted into string
		
	}

	public static void main(String[] args) {
		PrimitiveDataToString_12 string=new PrimitiveDataToString_12();
		string.primitive();
		
	}
}
