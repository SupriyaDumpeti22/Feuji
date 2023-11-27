package com.Nov27Day16WrapperClasses;

public class CheckStringNumber_5 {
	

	public static void main(String[] args) {

		String stringValue = "Supriya";
		String intValue = "2345.0";		
		
		
		// System.out.println(Integer.parseInt(stringValue));//exception
		///////////////////////////////////////////////
		//to know the value inside a string we have to use parseDouble because double can hold all numbers
		try {
			System.out.println(Integer.parseInt(intValue));
			System.out.println(Double.parseDouble(intValue));
		} catch (Exception e) {
			System.out.println("exception arised");
		}
		

	}

}
