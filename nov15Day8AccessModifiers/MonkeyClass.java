package com.nov15Day8AccessModifiers;

public  class MonkeyClass extends Animal{

	int id=1;
	String name="supriya";
	public void method() {
		System.out.println("method implimentation");
	}
	public void animalMethod() {
		System.out.println("Animal Methodsss");
	}
	
	public  void animalMethod1() 
	{
		System.out.println("Animal Methodsss11111");

	}
	public static void main(String[] args) {

		MonkeyClass monkey=new MonkeyClass();
		monkey.animalMethod();
		monkey.method();
		monkey.animalMethod1();		
	}
}
abstract class  Animal
{
	int value=1;
	public void animalMethod() {
		System.out.println("Animal Method");
	}
	public abstract void animalMethod1() ;
	
	
}
