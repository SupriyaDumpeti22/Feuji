package com.Nov24Day15StringClass;

public class StringCreation {

	String name="supriya";
	String clgname="avanthi";
	String name1=name;
	/////////////////////////////
	String sis=new String("supriya");
	String mom=new String("kavitha");
	String dad=mom;
	//////////////////////////////
	public void practice() {
		System.out.println(name==clgname);//compares address false
		System.out.println(name==name1);//compares address true
	}
	
	public void practice1() {
		System.out.println(sis==mom);//compares address false
		System.out.println(mom==dad);//compares address true
	}
	
	public void equals() {
		System.out.println(name.equals(clgname));//compares value false
		System.out.println(name.equals(sis));//compares value true
		System.out.println(mom.toString().equals(dad.toString()));//to string return address true
		System.out.println(name.toString().equals(dad.toString()));//to string return address false



	}
	
	public static void main(String[] args) {
		StringCreation creation=new StringCreation();
		//creation.practice1();
		creation.equals();

	}
}
