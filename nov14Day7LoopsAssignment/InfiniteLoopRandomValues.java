package com.nov14Day7LoopsAssignment;

import java.util.Random;

public class InfiniteLoopRandomValues {

	public static void main(String[] args) {

		double value=Math.random();
		Random random=new Random();
		int res=0;
		int index=0;
		while(true)
		{
		    int res1 =random.nextInt(100);
		    System.out.println("randome value "+res1);
		   if(res1>res)
		   {
			   System.out.println("Greater");
		   }
		   else if(res1<res)
		   {
			   System.out.println("Smaller");

		   }
		   else
		   {
			   System.out.println("Equal");

		   }
		   res=res1;
		   index++;
		}
	}
	

}
