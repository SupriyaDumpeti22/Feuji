package com.nov10Day6FlowControlAssignment;

public class MinMaxValueArray6 {
	public void minMaxArrayValue()
	{
		int intArray[]= {40,6,73,5,9,3};
		int length=intArray.length;
		int max=0,min=0;
		int temp;
		for(int index=0;index<=length-1;index++)
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

	}

	public static void main(String[] args) {

		MinMaxValueArray6 array6=new MinMaxValueArray6();
		array6.minMaxArrayValue();
	}

}
