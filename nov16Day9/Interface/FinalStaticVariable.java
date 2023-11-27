package com.nov16Day9.Interface;

public class FinalStaticVariable {
	static int age = 23;
	  final int id=3;
	int salary=20;
	final static String NAME="supriya";
	
	public void finalVariable() {
		age = 34;
		salary=34;
		System.out.println(id);
	}
	public void methodfinalpara(final int salary) {
		//salary=23;//we can not change final variable  value 
		age = 34;
		System.out.println(id);
	}

	
	public static void main(String[] args) {
		final FinalStaticVariable finalStaticVariable = new FinalStaticVariable();
		finalStaticVariable.salary=34;
		final FinalStaticVariable finalStaticVariable1 = new FinalStaticVariable();

		System.out.println(finalStaticVariable.id);
		System.out.println(FinalStaticVariable.NAME);
		System.out.println(finalStaticVariable.NAME);


		
	}

}
