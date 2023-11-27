package com.Nov22Day13ConstructorsAssignment;

public class Constructor_2 {
	int personId;
	String personName;
	public int program=2;
	public Constructor_2() {
		
	}
    public Constructor_2(int personId) {
		this();
    	this.personId=personId;
	}
    public Constructor_2(int personId,String personName) {
		this(personId);
    	this.personName=personName;
    	System.out.println(this.program);
	}

}


