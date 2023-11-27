package com.nov9Day5Operators;

public class MiscellaneousOperator {
	
	public String miscellaneous1(int value1,int value2){
		String result=(value2>value1)?"true":"false";
		System.out.println(result);
		return result;
		
	}
	
	public boolean miscellaneous2(Object student){
		
		return (student instanceof Integer);
		
	}

}
