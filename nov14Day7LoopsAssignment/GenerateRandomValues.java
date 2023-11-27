package com.nov14Day7LoopsAssignment;

import java.util.Random;

public class GenerateRandomValues {

	public static void main(String[] args) {

		double value=Math.random();//generates random decimal values
		//System.out.println(value);
		Random random=new Random();
		int res=0;
		for(int index=0;index<=25;index++)
		{
		    int res1 =random.nextInt(100);//generate random integer values
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
		}
	}

}
