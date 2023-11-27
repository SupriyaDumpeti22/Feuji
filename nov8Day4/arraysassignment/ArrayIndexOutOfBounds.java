package com.nov8Day4.arraysassignment;

public class ArrayIndexOutOfBounds {
	
	public void arrayIndex() {
		int intArray[]= {3,45,67,3,45};
		System.out.println(intArray[2]);
		System.out.println(intArray[0]);
		System.out.println(intArray[6]);

		
	}

	public static void main(String[] args) {

		ArrayIndexOutOfBounds arrayIndexOutOfBound=new ArrayIndexOutOfBounds();
		arrayIndexOutOfBound.arrayIndex();
	}

}
