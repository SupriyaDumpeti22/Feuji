package com.nov15Day8AccessModifiers;

import java.util.Scanner;

public class WeekDayAssignment {

	public void weekDay(int value) {
		
		switch (value)
		{
		case 2:System.out.println("Tuesday");
		       System.out.println("2");		
			   break;
		case 1:System.out.println("Monday");
	           System.out.println("1");		
		        return;
		case 4:System.out.println("Thursday");
	           System.out.println("4");	
	           int a=0;
	           System.out.println(a);
	           
		        break;
		case 0:System.out.println("Sunday");
	           System.out.println("0");		
		        break;
		case 3:System.out.println("Wednesday");
	           System.out.println("3");		
		       break;
		case 5:System.out.println("Friday");
	           System.out.println("5");		
		       break;
		case 6:System.out.println("Saturday");
	           System.out.println("6");		
		       break;

		default:System.out.println("invalid,enter number between(0-6)");
			    break;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//System.out.print("Enter a number :");
		//int value=scanner.nextInt();

		//WeekDayAssignment weekDayAssignment=new WeekDayAssignment();
		//weekDayAssignment.weekDay(value);
		
		
	}

}
