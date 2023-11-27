package com.nov10Day6FlowControlAssignment;

public class PrintSquareHash7By7_12 {
	public void printHash() {
		
		for(int index1=1;index1<=7;index1++)
		{

			for(int index2=1;index2<=7;index2++)
			{
				System.out.print("#");		
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
      PrintSquareHash7By7_12 printSquareHash7By7_12=new PrintSquareHash7By7_12();
      printSquareHash7By7_12.printHash();
		
	}

}
