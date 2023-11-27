package com.nov17Day10ExceptionAssignment;

public class ExceptionExample_1_2 {
	int a=0;

	public void exceptionMethod()
	{
		try {
			System.out.println(10/a);
			
			
		}
		catch(ArithmeticException e){
			System.out.println(" Arithmetic exception"+e.getMessage());
			//return;//wont print next lines
		}
		System.out.println("complited");
	}

	public static void main(String[] args) {

		ExceptionExample_1_2 exceptionExample=new ExceptionExample_1_2();
		exceptionExample.exceptionMethod();
	}

}
