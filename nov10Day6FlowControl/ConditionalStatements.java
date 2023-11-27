package com.nov10Day6FlowControl;

import java.util.Scanner;

public class ConditionalStatements {
	
	Scanner scanner=new Scanner(System.in);
	Hyderabad hyderabad=new Hyderabad();
	CityNames cityNames;
	public void switchMethod()
	{
		System.out.println("Enter a City Name: ");
		String city=scanner.next();
		//cityNames=city;
		System.out.println("Enter Budget: ");
		Double budget=scanner.nextDouble();
		ConditionalStatements conditionalStatements=new ConditionalStatements();
		switch(city)
		{
		case "HYDERABAD":Hyderabad hyderabad=new Hyderabad();
		                 hyderabad.hydearabadMethod(budget);
		                 break;
		case "BENGALURU":conditionalStatements.bengaluruMethod(budget);
                        break;
		case "MUMBAI":conditionalStatements.mumbaiMethod(budget);
		              break;
		case "PUNE":conditionalStatements.puneMethod(budget);
		            break;          
		case "DELHI":conditionalStatements.delhiMethod(budget);
		             break;
		case "CHENNAI":conditionalStatements.chennaiMethod(budget);
		              break;
		default:System.out.println("Enter valid CityName ");
		        break;
		

		}
		
	}

	
	
	public void bengaluruMethod(Double budget) {

		if(budget>=34000)
		{
			System.out.println("--------welcome to bengaluru--------");

			System.out.println("Hotel      :4000(per day)");
			System.out.println("Travelling :7000");
			System.out.println("Food       :7000");
            double totalCount=20000+7000+7000;
            System.out.println("TotalCount:2000(5days)+5000+5000=34000");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
			ConditionalStatements conditionalStatements=new ConditionalStatements();
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
	
	public void mumbaiMethod(Double budget) {

		if(budget>=33000)
		{
			System.out.println("--------welcome to mumbai--------");

			System.out.println("Hotel      :4000(per day)");
			System.out.println("Travelling :7000");
			System.out.println("Food       :6000");
            double totalCount=20000+7000+6000;
            System.out.println("TotalCount:20000(5days)+7000+6000=33000");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
			ConditionalStatements conditionalStatements=new ConditionalStatements();
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
	public void puneMethod(Double budget) {

		if(budget>=28500)
		{
			System.out.println("--------welcome to pune--------");

			System.out.println("Hotel      :3000(per day)");
			System.out.println("Travelling :7000");
			System.out.println("Food       :6500");
            double totalCount=20000+7000+6000;
            System.out.println("TotalCount:15000(5days)+7000+6500=28500");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
			ConditionalStatements conditionalStatements=new ConditionalStatements();
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
	public void delhiMethod(Double budget) {

		if(budget>=30000)
		{
			System.out.println("--------welcome to delhi--------");

			System.out.println("Hotel      :3500(per day)");
			System.out.println("Travelling :6500");
			System.out.println("Food       :6000");
            double totalCount=20000+7000+6000;
            System.out.println("TotalCount:3500(5days)+6500+6000=30000");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
			ConditionalStatements conditionalStatements=new ConditionalStatements();
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
	public void chennaiMethod(Double budget) {

		if(budget>=24000)
		{
			System.out.println("--------welcome to chennai--------");

			System.out.println("Hotel      :2500(per day)");
			System.out.println("Travelling :5500");
			System.out.println("Food       :6000");
            double totalCount=20000+7000+6000;
            System.out.println("TotalCount:2500(5days)+5500+6000=24000");
            System.out.println("Have a nice Trip");


		}
		else
		{
			System.out.println("Not available,Please try another one");
			System.out.println("Enter a City Name: ");
			String cityName=scanner.next();
			System.out.println("Enter Budget: ");
			Double budget1=scanner.nextDouble();
			ConditionalStatements conditionalStatements=new ConditionalStatements();
			switch(cityName)
			{
			case "HYDERABAD":hyderabad.hydearabadMethod(budget1);
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
	
	public static void main(String[] args) {
		ConditionalStatements conditionalStatements=new ConditionalStatements();
        conditionalStatements.switchMethod();
	}
	

}
