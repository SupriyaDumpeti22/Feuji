package com.nov8Day4.arrays;

import com.nov7Day3.variables.Student;

public class ObjectArray {
	
	public void studentMethod() {
		
		Student []persons=new Student[5];
		Student student1=new Student();
		persons[0]=student1;
		persons[1]=new Student();
		persons[2]=new Student();
		persons[4]=new Student();
		
		System.out.println(persons[1]);
		persons[1].setStudentName("subbu");

		System.out.println(persons[1].getStudentName());
		System.out.println(persons[0].getStudentAge());


		
	}
	
	public Student[] studentMethod2() {
		
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student student4=new Student();
		
		return new Student[] {student1,student2,student3,student4};

		
	}

	public static void main(String[] args) {

		ObjectArray objectArray=new ObjectArray();
		objectArray.studentMethod();
		
		Student student[]=objectArray.studentMethod2();
		student[1].setStudentName("sunitha");
		System.out.println(student[1].getStudentName());
	}

}
