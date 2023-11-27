package com.nov16Day9.Interface;

public class Scross implements Car_1,Sunroof{

	public static void main(String[] args) {

		Car_1 scross=new Scross();
		scross.openDoor(12, 23);//only access methods of Car
		Sunroof scross1=new Scross();
		scross1.roof();////only access methods of Sunroof
		System.out.println("----------");
		Scross scross2=new Scross();////only access methods of car,sunroof
		scross2.openDoor(23, 45);
		scross2.roof();	
	}

	@Override
	public void roof() {

		System.out.println("roof");
	}

	@Override
	public void openDoor(int a, double b) {

		System.out.println("opendoor");
	}

}
