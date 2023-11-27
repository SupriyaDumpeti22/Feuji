package com.nov10Day6FlowControl;

import java.util.Scanner;

public class Hyderabad {
	public void hydearabadMethod(Double budget) {

		Scanner scanner =new Scanner(System.in);
		ConditionalStatements conditionalStatements=new ConditionalStatements();
		if(budget>=20000)
		{
			System.out.println("--------welcome to hyderabad--------");

			System.out.println("Hotel      :2000(per day)");
			System.out.println("Travelling :5000");
			System.out.println("Food       :5000");
            double totalCount=10000+5000+5000;
            System.out.println("TotalCount:2000(5days)+5000+5000=20000");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
            Hyderabad hyderabad=new Hyderabad();
			switch(cityName)
			{
			case "HYDERABAD":
			                 hyderabad.hydearabadMethod(budget1);
			                 break;
			case "BENGALURU":conditionalStatements.bengaluruMethod(budget1);
	                        break;
			case "MUMBAI":conditionalStatements.mumbaiMethod(budget1);
			              break;
			case "PUNE":conditionalStatements.puneMethod(budget1);
			            break;          
			case "DELHI":conditionalStatements.delhiMethod(budget1);
			             break;
			case "CHENNAI":conditionalStatements.chennaiMethod(budget1);
			              break;
			default:System.out.println("Enter valid CityName ");
			        break;
			}
		}
		
	}

}
