package com.nov8Day4.arrays;

public class IntArray {
	
	
	void array()
	{

		int[] intArray=new int[5];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		
		System.out.println(intArray[2]);
		System.out.println(intArray[1]);

	}

	

	public static void main(String[] args) {

		IntArray intArray=new IntArray();
		intArray.array();
		
	}

}
