package com.Nov22Day13ConstructorsAssignment;

public class StaticVarInCon_5 {
	
	static int id=3;
	public StaticVarInCon_5() {
	    int id=7;//we cant initialize static var in constructor
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		StaticVarInCon_5 con_5=new StaticVarInCon_5();
	}

}
