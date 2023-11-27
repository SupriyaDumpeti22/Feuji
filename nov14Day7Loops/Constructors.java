package com.nov14Day7Loops;

import com.nov7Day3.variables.Student;

public class Constructors {

	public static void main(String[] args) {

		 Student student1=new Student(1,"supriya");
		 Student student2=new Student(2,"sunni");
		 Student student3=new Student();
		 Student student[]= {student1,student2,student3};

		 for(int index=0;index<student.length;index++)
		 {
			 Student s1=student[index];
			 System.out.println(s1.getStudentName());
			 System.out.println(s1.getStudentAge());
			 System.out.println(s1.studentId);

		 }
		
		
	}

}
