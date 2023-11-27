package com.nov14Day7LoopsAssignment;

public class SortingArray {

	public static void main(String[] args) {

		int intArray[]= {11,2,30,40,5};
		int temp;
		for( int index1=0;index1<=intArray.length-1;index1++)
		{
			for(int index2=0;index2<=intArray.length-1;index2++)
			{
				if(intArray[index1]<=intArray[index2])
				{
					temp=intArray[index1];
					intArray[index1]=intArray[index2];
					intArray[index2]=temp;
				}
			}
			
		}
		System.out.println("Ascending Order");

		for(int index=0;index<intArray.length;index++)
		{
			System.out.println(intArray[index]);
		}
		System.out.println("Descending Order");

		for(int index=intArray.length-1;index>=0;index--)
		{
			System.out.println(intArray[index]);

		}
	}

}
