package com.Nov21Day12OOPSAssignment;

public class InheritanceAnimalDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.legs();
	}

}

class Animal {
	String name = "dog";

	public void legs() {

		System.out.println("4 legs");
	}
	public void hands() {
		System.out.println("4 hands");
	}
}

class Dog extends Animal {
	String dogname = "chintu";

	public void legs() {	
		System.out.println(name);
		System.out.println("4 legsdog");
		hands();
	}
	
}
