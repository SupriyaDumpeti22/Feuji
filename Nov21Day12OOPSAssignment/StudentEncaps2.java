package com.Nov21Day12OOPSAssignment;

public class StudentEncaps2 {

	private int studentId;
	private String studentName;
	private int studentMarks;
	
	public StudentEncaps2(int studentId,String studentName,int studentMarks) {

		this.studentId=studentId;
		this.studentName=studentName;
		this.studentMarks=studentMarks;
		
	}
	
	public void display()
	{
		System.out.println(studentId+" "+studentName+" "+studentMarks);
	}
}
