package com.nov17Day10ExceptionAssignment;

import com.nov7Day3.variables.Student;

public class TryMultupleCatches {
	int intArray[] = { 23, 34, 45, 2 };
	int length = intArray.length;

	public void indexOutOfBoundsException() {
     try 
     {
		length++;
		System.out.println(intArray[length]);
        }
     
     catch(ArithmeticException c)
     {
    	 System.out.println(c.getMessage());
     }
     catch(NullPointerException n)
     {
    	 System.out.println(n.getMessage());
     }
     catch(IndexOutOfBoundsException i)
     {
    	 System.out.println(i.getMessage());
     }
		
	}

	public static void main(String[] args) {

		TryMultupleCatches catches = new TryMultupleCatches();
		catches.indexOutOfBoundsException();
	}

}
