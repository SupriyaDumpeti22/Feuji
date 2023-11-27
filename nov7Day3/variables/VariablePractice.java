package com.nov7Day3.variables;

import com.nov15Day8AccessModifiers.AllAccessModifiers;
import com.nov15Day8AccessModifiers.Public_ClassProperties;

public class VariablePractice extends AllAccessModifiers{

	char intValue;
	String stringValue;

	static void addition(int value1, int value2) {
		double intValue3 = 90;// we have to initialize the local variable to print,local variables won't have
								// default value
		System.out.println("result " + value1 + value2);
		System.out.println(intValue3);

	}

	public static void main(String[] args) {
//
//		VariablePractice variablePractice = new VariablePractice();
//		System.out.println(variablePractice.intValue);
//		variablePractice.addition(10, 20);
//
//		Student student = new Student();
//
//		System.out.println(student.studentId);
//		student.setStudentName("supriya");
//		System.out.println(student.getStudentName());
//		
//		System.out.println(args[1]);

		AllAccessModifiers modifiers=new AllAccessModifiers();
		VariablePractice variablePractice = new VariablePractice();

		System.out.println(modifiers.id);
		//System.out.println(modifiers.address);
		System.out.println(variablePractice.name);
		//System.out.println(modifiers.age);//we can not access because it is private
		modifiers.publicMethod();
		variablePractice.protectedMethod();//protected method cant access in another package
		//modifiers.defaultMethod();//default method can not access in another package
		//modifiers.privateMethod();//private method cannot access in another class

	}

}
