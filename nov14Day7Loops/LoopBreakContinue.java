package com.nov14Day7Loops;

public class LoopBreakContinue {

	public static void main(String[] args) {
		int value=9;
		while(value>=9)
		{
			System.out.println("value is"+value);
			
			value++;
			if(value==15)
			{
				continue;
			}
			System.out.println("999");
			if(value==17)
			{
				break;
			}
		}

	}

}
