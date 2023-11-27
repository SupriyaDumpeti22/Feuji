package com.nov10Day6FlowControlAssignment;

public class NumberPattern10 {
	public void numberPattern()
	{
		for(int index1=1;index1<=5;index1++)
		{
			int number=1;

			for(int index2=1;index2<=5;index2++)
			{
				if(index1+index2>=6)
				System.out.print(number++);		
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberPattern10 numberPattern10=new NumberPattern10();
		numberPattern10.numberPattern();
	}

}
