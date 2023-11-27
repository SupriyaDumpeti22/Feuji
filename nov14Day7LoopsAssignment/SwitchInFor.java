package com.nov14Day7LoopsAssignment;

public class SwitchInFor {
	public void switchInfor() {
		int value = 3;
		for (int index = 0; index < 3; index++) 
		{
			switch (value++) 
			{
			case 1:
				System.out.println("Sunday");
				
			case 2:
				System.out.println("Monday");
				
			case 3:
				System.out.println("Tuesday");
				
			case 4:
				System.out.println("Wednesday");
				
			case 5:
				System.out.println("Thursday");
				
			case 6:
				System.out.println("Friday");
				
			case 7:
				System.out.println("Saturday");
				System.out.println("----------");
				

			}
			
		}
	}

	public static void main(String[] args) {

		SwitchInFor switchInFor = new SwitchInFor();
		switchInFor.switchInfor();
	}

}
