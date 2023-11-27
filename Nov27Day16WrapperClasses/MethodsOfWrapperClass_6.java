package com.Nov27Day16WrapperClasses;

public class MethodsOfWrapperClass_6 {
	
	public static void main(String[] args) {
		
	Integer intObj=12;
	int intValue=122;
	Integer intObject=123;
	Character charObject='a';

	System.out.println(intObj.compareTo(intValue));//values
	System.out.println(intObj.equals(intObject));//values
	System.out.println(intObject.hashCode());//unique int
	System.out.println(charObject.toString());
	System.out.println(charObject.getClass());//address of class
	System.out.println(intObj.getClass());//address of class
	System.out.println(Integer.bitCount(charObject));//gives bits
	System.out.println(Integer.compare(intValue, intObject));
	System.out.println(intObj.compareTo(intObject));
	System.out.println(Boolean.logicalAnd(true, true));
	System.out.println(Character.MIN_VALUE);







	


	}
	
	

}
