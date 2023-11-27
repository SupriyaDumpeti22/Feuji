package com.Nov21Day12OOPSAssignment;

public class MultiLevelInheritence extends WildAnimal{
	public void lion() {
		System.out.println("lion");
	}
	public static void main(String[] args) {
		MultiLevelInheritence inheritence=new MultiLevelInheritence();
		inheritence.lion();
		inheritence.wildAnimal();
		inheritence.animal();
	//	MultiLevelInheritence animals=(MultiLevelInheritence) new Animals();//not possible
	//	animals.animal();
	}
}

class Animals{
	public void animal() {
		System.out.println("animal");
	}
}

class WildAnimal extends Animals{
	public void wildAnimal() {
		System.out.println("Wildanimal");

	}
}