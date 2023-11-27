package com.Nov21Day12OOPSAssignment;

public class StaticPolymorphism {

	
	public static void main(String[] args) {
		StaticPolymorphism polymorphism=new StaticPolymorphism();
		polymorphism.car();
		polymorphism.car("2000cc");
		polymorphism.car("3000cc","red");
		polymorphism.colour="white";
System.out.println(polymorphism.colour);
	
}
 
	
 private String engine;
	String colour;
	public static void car() {
		System.out.println("car");
	}
	public  void car(String engine)
	{
		this.engine=engine;
		System.out.println("car with"+engine);
	}
	public void car(String engine,String colour)
	{
		this.engine=engine;
		this.colour=colour;

		System.out.println("car with"+engine+" "+colour );
	}
	
}
