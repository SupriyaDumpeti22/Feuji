package com.nov10Day6FlowControlAssignment;

public class SumAndAverage9 {

//	public void sumAndaAverage(int index)
//	{
//		for(int index) {
//			
//		}
//		
//	}
	public static void main(String[] args) {
		SumAndAverage9 andAverage9=new SumAndAverage9();

		int sum=0, c=1;double avg=0;
		for (int index=1;index<=100;index++)
		{
			//andAverage9.sumAndaAverage(index);
			 sum=sum+index;
			 avg=sum/c;
			 c++;
		}
		System.out.println("sum is :"+sum);
		System.out.println("avg is :"+avg);

	}
}
