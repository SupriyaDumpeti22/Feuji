package com.nov10Day6FlowControlAssignment;

public class TableMultiplication_15 {
	public void multiplication(int value) 
	{

		System.out.print(value+"|");

		for(int row=1;row<10;row++)
		{
			System.out.print(row*value+" ");
		}
		System.out.println();
		System.out.println();

		
	}

	public static void main(String[] args) {
		TableMultiplication_15 tableMultiplication_15=new TableMultiplication_15();
		System.out.print("*|");
		for(int first=1;first<10;first++)
		{
			System.out.print(first+" ");
		}
		System.out.println();
		System.out.println("-----------------");

		System.out.println();

		for(int value=1;value<=9;value++)
		{
		 tableMultiplication_15.multiplication(value);
		}
		

	}

}
