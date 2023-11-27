package com.nov17Day10ExceptionAssignment;

import com.nov8Day4.arraysassignment.ArrayIndexOutOfBounds;

public class MultipleExceptionsOneCatch_6 {

	int intArray[]= {23,1,0,3,7};
	int intArrays[]= null;
	
	
	 int length=intArray.length;
	//int lengths=intArrays.length;//we cant find length of null object
	 
	public void multipleException() {
		
		try {
		System.out.println(intArray[6]);
		System.out.println(intArrays[5]);

		}
		catch(IndexOutOfBoundsException | NullPointerException  a) {
			System.out.println(a.getClass());
		}
		
	}
	public static void main(String[] args) {
		MultipleExceptionsOneCatch_6 oneCatch=new MultipleExceptionsOneCatch_6();
		oneCatch.multipleException();

	}

}
