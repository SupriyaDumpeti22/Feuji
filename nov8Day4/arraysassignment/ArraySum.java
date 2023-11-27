package com.nov8Day4.arraysassignment;

public class ArraySum {
	int index=0;
	int intArray[]= {1,2,3,4};
	
	int sum=0;
	
	public void sumMethod() {
		 
		 sum=sum+intArray[index];
		
		if(index==3)
		{
			System.out.println(sum);
			
		}
		index++;
		if(index!=4) {
			sumMethod();
		}
		
	}
	public void sumArray() {
		double doubleArray[]= {22.3,34.6,589.7,656.3};
		System.out.println(doubleArray.length);
		double sumvalue=doubleArray[0]+doubleArray[1]+doubleArray[2]+doubleArray[3];
		System.out.println(sumvalue);
	}

	public static void main(String[] args) {

		ArraySum arraySum=new ArraySum();
		//arraySum.sumArray();
		arraySum.sumMethod();


		
		
	}

}
