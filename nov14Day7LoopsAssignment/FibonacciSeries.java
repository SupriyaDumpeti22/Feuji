package com.nov14Day7LoopsAssignment;

public class FibonacciSeries {
	public void fibonacci() {
		int value1 = 0;
		int value2 = 1;	
		int value3;
		double avg=1;
		System.out.print("The First 20 Fibonacci Series are:");
		System.out.print(value1+" "+value2 );
		for (int index = 1; index <= 19; index++) {
			value3 = value1 + value2;
			System.out.print(" "+value3);
			value1 = value2;
			value2 = value3;
			avg=avg+value3;
			
		}
		avg=avg/20;
		System.out.println();
		System.out.println("The Avergae is "+avg);
		
 
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries=new FibonacciSeries();
		fibonacciSeries.fibonacci();

	}

}
