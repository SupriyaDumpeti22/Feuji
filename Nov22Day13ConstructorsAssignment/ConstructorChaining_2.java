package com.Nov22Day13ConstructorsAssignment;

public class ConstructorChaining_2 extends Constructor_2{
	
	String studentName;
	int studentId;
	public ConstructorChaining_2() {
		
	}
    public ConstructorChaining_2(String studentName,int personId) {
    	super(personId);
    	super.program=2;
    	super.personId=personId;
    	this.studentName=studentName;
    
	}
    public ConstructorChaining_2(String studentName,int studentId,int personId,String personName) {
    	this(studentName,personId);
    	this.studentId=studentId;
    
	}
    public void display() {
    	System.out.println(studentName+" "+studentId+" "+personId+" "+personName+" "+program);
    }
    public static void main(String[] args) {
		
    Constructor_2 constructor_2=new Constructor_2(3,"mental");
    ConstructorChaining_2 chaining_2=new ConstructorChaining_2("supriya",1,2,"psycho");
    chaining_2.display();
    }
}
