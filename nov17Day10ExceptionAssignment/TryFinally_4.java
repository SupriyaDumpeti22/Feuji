package com.nov17Day10ExceptionAssignment;

import com.nov8Day4.arraysassignment.ArrayIndexOutOfBounds;

public class TryFinally_4 {
	int intArray[]= {2,3,4,67};

	public void indexOutOfBounds() {
		try {
			System.out.println(intArray[4]);
		}
		finally {
			System.out.println("ArrayIndexOutOfbounds Exception");
		}
	}

	public static void main(String[] args) {

		TryFinally_4 tryFinally_4=new TryFinally_4();
		tryFinally_4.indexOutOfBounds();
	}

}
