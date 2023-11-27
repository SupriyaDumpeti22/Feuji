package com.nov10Day6FlowControlAssignment;

import java.util.Scanner;

public class ElectricityBillUsage8 {
	public void electricityBill(int units)
	{
		if(units<=50)
		{
			System.out.println("Rs 250:Minimum Usage");
		}
		else if(units>50&&units<=100)
		{
			System.out.println("Rs "+units*5+":Moderate Usage");
			
		}
		else if(units>100)
		{
			System.out.println("Rs "+units*8+":High Usage");
			
		}
		else
		{
			System.out.println("Enter valid number");
		}
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num of units consumed");
		int units=scanner.nextInt();
		ElectricityBillUsage8 billUsage8=new ElectricityBillUsage8();
		billUsage8.electricityBill(units);
	}

}
