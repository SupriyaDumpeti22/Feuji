package com.nov10Day6FlowControlAssignment;

import java.util.Scanner;

public class GreaterOfThree5 {
	public void greaterNumber(int value1,int value2,int value3) {
		
		if(value1>value2)
		{
			if(value1>value3)
			{
				System.out.println(value1 +" is greater");
			}
			else
			{
				System.out.println(value3 +" is greater");
			}
		}
		else if(value2>value3)
		{
			System.out.println(value2+" is greater");
		}
		else
		{
			System.out.println(value3+" is greater");
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value1:");
		int value1=scanner.nextInt();
		System.out.println("Enter value2:");
		int value2=scanner.nextInt();
		System.out.println("Enter value3:");
		int value3=scanner.nextInt();

		GreaterOfThree5 greaterOfThree5=new GreaterOfThree5();
		greaterOfThree5.greaterNumber(value1,value2,value3);
	}

}
