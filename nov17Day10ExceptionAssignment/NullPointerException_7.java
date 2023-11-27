package com.nov17Day10ExceptionAssignment;

public class NullPointerException_7 {
	String name1=null;
	String name2="supriya";
	public void nullPointer() {
		
		try 
		{
		   System.out.println(name1.equals(name2));
	    }
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		NullPointerException_7 pointerException=new NullPointerException_7();
		pointerException.nullPointer();
		
	}

}
