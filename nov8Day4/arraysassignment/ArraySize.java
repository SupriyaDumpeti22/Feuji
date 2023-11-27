package com.nov8Day4.arraysassignment;

public class ArraySize {

	public void arrayNegSize() {
		int intArray[]=new int[-4];//NegativeArraysize
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		intArray[3]=10;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);


		
	}
	public static void main(String[] args) {

		ArraySize arraySize=new ArraySize();
		arraySize.arrayNegSize();
		
	}

}
