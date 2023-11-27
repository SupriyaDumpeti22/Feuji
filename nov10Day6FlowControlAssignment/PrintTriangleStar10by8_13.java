package com.nov10Day6FlowControlAssignment;

public class PrintTriangleStar10by8_13 {
	public void printTriangleStar() {

		for (int index1 = 1; index1 <= 10; index1++) {

			for (int index2 = 1; index2 <= 10; index2++)
			{
				if (index1 == 2 || index1 == 4)
				{
				System.out.print("");
				}
				else if (index1 <= index2)
					{
						System.out.print("*");
						
					}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		PrintTriangleStar10by8_13 triangleStar10by8_13 = new PrintTriangleStar10by8_13();
		triangleStar10by8_13.printTriangleStar();
	}

}
