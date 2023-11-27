package com.nov10Day6FlowControlAssignment;

public class MultiplicationOf3 {
	public void multiplicationOf3()
	{
		int rowValue=1;
		while(rowValue<=10)
		{
			int result=3*rowValue;
			if(result%2!=0)
			{
				System.out.println(+result);
			}
			rowValue++;
		}
	}
	public void multiplicationOf3DoWhile()
	{
		int rowValue=1;
		do
		{
			int result=3*rowValue;
			if(result%2!=0)
			{
				System.out.println(+result);
			}
			rowValue++;
		}while(rowValue<=10);
	}
	
	
	public static void main(String[] args) {
		MultiplicationOf3 multiplicationOf3=new MultiplicationOf3();
		//multiplicationOf3.multiplicationOf3();
		multiplicationOf3.multiplicationOf3DoWhile();

	}

}
