package com.nov14Day7LoopsAssignment;

public class BubbleSelectionInsertion {
	
	public void bubbleSort() {
		int intArray[]= {10,23,45,43,2};
		int length=intArray.length;
		int temp;
		for(int index=length-1;index>=0;index--)
		{
			for(int index2=0;index2<index;index2++)
			{
				if(intArray[index2]>intArray[index2+1])
				{
					temp=intArray[index2];
					intArray[index2]=intArray[index2+1];
					intArray[index2+1]=temp;
				}
			}
		}
		for(int index=0;index<=length-1;index++)
		{
		  System.out.println(intArray[index]);
		}
	}
	
	public void selectionSort() {
		
		int intArray[]= {12,34,-45,789,30,4};
		int length=intArray.length;
		int temp;
		for(int index=0;index<=length-1;index++)
		{

			for(int index2=index;index2<length-1;index2++)
			{
				if(intArray[index]>intArray[index2+1]) {
					
					  temp=intArray[index];
					  intArray[index]=intArray[index2+1];
					  intArray[index2+1]=temp;
				}	
			}		
		}
		for(int index=0;index<=length-1;index++) {
			System.out.println(intArray[index]);
		}
	}
	
	public void insertion() {
		int intArray[]= {34,23,10,2,5,6};
		int length=intArray.length;
		int temp;
		for(int index=1;index<=length-1;index++)
		{
			for(int index2=index-1;index2>=0;index2--)
			{
				if(intArray[index]<intArray[index-1])
				{
					temp=intArray[index];
					intArray[index]=intArray[index-1];
					intArray[index-1]=temp;
				}
			}
		}
		for(int index=0;index<=length-1;index++)
		{
			System.out.println(intArray[index]);
		}
	}

	public static void main(String[] args) {
		BubbleSelectionInsertion bubbleSelectionInsertion=new BubbleSelectionInsertion();
		//bubbleSelectionInsertion.bubbleSort();
		//bubbleSelectionInsertion.selectionSort();
		bubbleSelectionInsertion.insertion();

		
	}

}
