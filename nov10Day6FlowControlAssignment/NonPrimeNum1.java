package com.nov10Day6FlowControlAssignment;

import java.util.Scanner;

public class NonPrimeNum1 {
	public void forLoopNonPrime(int index) {

		int count=0;
		for(int value=2;value<=index/2;value++)
		{
			if(index%value==0)
			{
				count++;		
			}
		}
		if(count!=0||index==1)
		{
			System.out.println("NonPrimeNumber:"+index);
		}
	}

	public void whileLoopNonPrime(int index) {
		int c=0;int value=1;
		while(index>=value)
		{
			if(index%value==0)
			{
				c++;
			}
			value++;
		}
		if(c>=2&&c!=2)
		{
			System.out.println("NonPrimeNum:"+index);
		}
		

	}
	public void doWhileLoopNonPrime(int index) {
	
		int c=0;int value=1;
		do
		{
			if(index%value==0)
			{
				c++;
			}
			value++;
		}
		while(index>=value);
		
		if(c>=2&&c!=2)
		{
			System.out.println("NonPrimeNum:"+index);
		}
		

	}
		

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		NonPrimeNum1 nonPrimeNum1 = new NonPrimeNum1();
		System.out.println("NonPrimeNumbers");
		for (int index = 1; index <= 100; index++) {
			nonPrimeNum1.forLoopNonPrime(index);
//			nonPrimeNum1.whileLoopNonPrime(index);
//			nonPrimeNum1.doWhileLoopNonPrime(index);
		}
	}

}
