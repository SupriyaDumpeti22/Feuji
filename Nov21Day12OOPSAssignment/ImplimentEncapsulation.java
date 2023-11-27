package com.Nov21Day12OOPSAssignment;

public class ImplimentEncapsulation {

	public static void main(String[] args) {
		
	
	StudentEncapsulation encapsulation=new StudentEncapsulation();
	encapsulation.setStudentId(1);
	encapsulation.setStudentName("supriya");
	encapsulation.setStudentMarks(80);
	
	System.out.println(encapsulation.getStudentId());
	String name=encapsulation.getStudentName();
	System.out.println(name);
	
	
	
	
	StudentEncaps2 encaps2=new StudentEncaps2(2,"sunitha",82);
	encaps2.display();
	}
	
}
