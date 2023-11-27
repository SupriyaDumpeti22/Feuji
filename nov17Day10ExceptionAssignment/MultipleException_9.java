package com.nov17Day10ExceptionAssignment;

public class MultipleException_9 {
	int intArray[]= {23,1,0,3,7};
	int intArrays[]= null;
	
	String stringArray[]=new String[-3];
	
	 int length=intArray.length;
	public void multipleException() {
		try {
		int length=intArrays.length;
		System.out.println(length);
		  try 
		  {
			System.out.println(intArray[6]);
		  }
		 catch(ArrayIndexOutOfBoundsException c)
		  {
			System.out.println(c.getMessage());
		  }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try
		{
			System.out.println(stringArray[-1]);
		}
		catch(NegativeArraySizeException e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		MultipleException_9 multipleException_9=new MultipleException_9();
		multipleException_9.multipleException();
	}

}
