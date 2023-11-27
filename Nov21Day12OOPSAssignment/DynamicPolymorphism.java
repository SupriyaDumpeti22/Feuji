package com.Nov21Day12OOPSAssignment;

class Polymorphism{
	int i=0;

	public void write() {
		System.out.println("writing");
		System.out.println(i);
	}
	
}
public class DynamicPolymorphism extends Polymorphism {
	int i=10;
    @Override
	public void write() {
    	
		System.out.println("writing practicing");
	}
	
	public static void main(String[] args) {
		Polymorphism polymorphism=new Polymorphism();
		polymorphism.write();
		System.out.println(polymorphism.i);
		
	}
}
