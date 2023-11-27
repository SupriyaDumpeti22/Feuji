package com.nov10Day6FlowControlAssignment;

public class PrintSquareHash5By5_11 {
	public void printHash() 
	{
		for(int index1=1;index1<=5;index1++)
		{

			for(int index2=1;index2<=5;index2++)
			{
				System.out.print("#");		
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		PrintSquareHash5By5_11 hash11=new PrintSquareHash5By5_11();
		hash11.printHash();
	}

}
