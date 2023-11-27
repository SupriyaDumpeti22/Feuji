package com.nov7Day3.variables;

public class Student{// POJO r BEAN r PLAIN Class(which doesn't contains logic&contain variables and
						// methods(getter)

	public int studentId;
	private String studentName;
	private int studentAge;
	
	public Student()//default constructor
	{
	
	}
	
	public Student(int studentId,String studentName){//parameterized constructor
		this.studentId=studentId;
		this.studentName=studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public void test() {
		System.out.println("test");
	}

}
