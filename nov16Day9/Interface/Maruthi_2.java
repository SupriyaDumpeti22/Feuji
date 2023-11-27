package com.nov16Day9.Interface;

abstract class Vehicle{
 static String name="car";
	static void engine() {
		System.out.println(" has engine");
	}
	abstract void mooving();
	 abstract void wheels();
	
}
public class Maruthi_2 extends Vehicle implements Car_1 {

	public static void main(String[] args) {

		Maruthi_2 maruthi_2=new Maruthi_2();
		maruthi_2.mooving();
		maruthi_2.name="carrr";
		System.out.println(maruthi_2.name);
		System.out.println("-----------------");
		maruthi_2.openDoor(12, 34);
		//maruthi_2.carname="bmw";//we can not change the variable in interface
		System.out.println(maruthi_2.carname);
	}

	@Override
	void mooving() {

		System.out.println("maruthi is mooving");
	}

	@Override
	void wheels() {
		System.out.println("maruthi has wheels");
		
	}

	@Override
	public void openDoor(int a, double b) {

		System.out.println("open door");
	}

}
