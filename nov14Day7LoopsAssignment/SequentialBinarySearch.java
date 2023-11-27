package com.nov14Day7LoopsAssignment;

public class SequentialBinarySearch {

	public void sequential() {
		int intArray[]= {12,23,45,2,4,89,0};
		int value=23;
		int length=intArray.length-1;
		for(int index=0;index<=length;index++)
		{
			if(value==intArray[index])
			{
				System.out.println("element "+value+" present in the position "+index);
			}
		}
	}
	
	public void binary() {
		
		int intArray[]= {2,5,12,25,33,90};
		int value=12;
		int length=intArray.length;
		int mid=length/2;
		System.out.println(mid);
		for(int index=0;mid>=1;index++)
		{
			if(intArray[mid]>=value)
			{
				if(intArray[mid]==value)
				{
					System.out.println(mid);
				}
				int s=index;
				int l=mid;
				mid=s+l/2;
			}
			else if(intArray[mid]<=value)
			{
				int s=mid;
				int l=length;
				mid=s+l/2;
			}
			
		}
		System.out.println(intArray[mid]);
		
	}
	public static void main(String[] args) {
		SequentialBinarySearch binarySearch=new SequentialBinarySearch();
		binarySearch.binary();

		
	}

}
