package com.nov8Day4.arrays;

public class TwoDimensional {
	
	public void intMethod() {
		
		int [][]intArray=new int[4][4];
		
		intArray[0]=new int[4];
		intArray[0][0]=10;
		intArray[0][1]=20;
		intArray[0][2]=30;
		intArray[0][3]=40;
		System.out.println(intArray[0]);
		System.out.println(intArray[0][1]);
		System.out.println(intArray[0][2]);


		intArray[1]=new int[4];
		intArray[1][0]=10;
		intArray[1][1]=20;
		intArray[1][2]=30;
		intArray[1][3]=40;
		System.out.println(intArray[0]);
		System.out.println(intArray[1][1]);
		System.out.println(intArray[1][2]);
		
		intArray[2]=new int[4];
		intArray[2][0]=10;
		intArray[2][1]=20;
		intArray[2][2]=30;
		intArray[2][3]=40;
		
		intArray[3]=new int[4];
		intArray[3][0]=10;
		intArray[3][1]=20;
		intArray[3][2]=30;
		intArray[3][3]=40;

		
	}

	public static void main(String[] args) {

		TwoDimensional dimensional=new TwoDimensional();
		dimensional.intMethod();
	
	}

}
