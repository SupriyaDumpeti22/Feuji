package com.nov10Day6FlowControlAssignment;

import java.util.Scanner;

public class MarksArray7 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sub1:");
		int sub1=scanner.nextInt();
		System.out.println("Enter sub2:");
		int sub2=scanner.nextInt();
		System.out.println("Enter sub3:");
		int sub3=scanner.nextInt();
		System.out.println("Enter sub4:");
		int sub4=scanner.nextInt();
		System.out.println("Enter sub5:");
		int sub5=scanner.nextInt();
		
		int intArray[]= {sub1,sub2,sub3,sub4,sub5};
		int length=intArray.length;
		int max=0,min=0;
		int temp;
		for(int index=0;index<length;index++)
		{
			for(int index2=0;index2<=length-1;index2++)
			{
				if(intArray[index]<=intArray[index2])
				{
					temp=intArray[index];
					intArray[index]=intArray[index2];
					intArray[index2]=temp;
				}
			}
		}
		for(int i=0;i<=length-1;i++)
		{
			System.out.println(intArray[i]);
		}
		System.out.println("Maximum Value of Array:"+intArray[0]);
		System.out.println("Minimum Value of Array:"+intArray[length-1]);

		double avg=sub1+sub2+sub3+sub4+sub5/5;
		System.out.println("average"+avg);
		
	}

}
