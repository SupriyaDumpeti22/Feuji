package com.nov8Day4.arraysassignment;

public class ArrayDeclaration {
	public void declareMethod1() {
		String stringArray[] = new String[4];
		stringArray[0] = "supriya";
		stringArray[1] = "sunitha";
		stringArray[2] = "sonu";
		stringArray[3] = "monu";

		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);

	}

	public void declareMethod2() {
       String stringArray[]= {"supriya","sunitha","sonu","stubborn"};
       System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);
	}
	
	public String[] declareMethod3() {
		return new String[] {"supriya","sunitha","bhanu","stubborn"};
	}

	public static void main(String[] args) {
		ArrayDeclaration arrayDeclaration = new ArrayDeclaration();
		arrayDeclaration.declareMethod1();
		
		arrayDeclaration.declareMethod2();
		
		String stringArray[]=arrayDeclaration.declareMethod3();
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);

	}

}
