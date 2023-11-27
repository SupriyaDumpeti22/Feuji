package com.nov16Day9.Interface;

 interface BMW extends Car_1{
	String carNAME="bmw";
	void steering();
}
public class BMW_Model2_3 implements BMW{

	@Override
	public void openDoor(int a, double b) {
		System.out.println("opendoor");
	}

	@Override
	public void steering() {
		
		System.out.println("steering");
	}
	
	public static void main(String[] args) {
		BMW_Model2_3 bmw_Model2_3=new  BMW_Model2_3();
		bmw_Model2_3.openDoor(13, 34);
		bmw_Model2_3.steering();
		System.out.println(bmw_Model2_3.carname);
		
	}
	
}
 