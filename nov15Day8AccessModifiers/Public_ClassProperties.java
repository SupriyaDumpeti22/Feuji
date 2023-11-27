package com.nov15Day8AccessModifiers;

import org.junit.jupiter.api.Test;

import com.nov7Day3.variables.Student;

public class  Public_ClassProperties  extends Student{
	public int value=30;// we can access these properties through out the project
	public String name="supriya"; 
	public void exampleMethod()
	{
		System.out.println(value+name);
		System.out.println(studentId);//we can access public properties through inheritance
		System.out.println(getStudentAge());

	}

	public static void main(String[] args) {
//       Public_ClassProperties properties=new Public_ClassProperties();
//     System.out.println(properties.value);
//     properties.exampleMethod();
//     properties.test();
//     
     
     AllAccessModifiers modifiers=new AllAccessModifiers();
		System.out.println(modifiers.id);
		System.out.println(modifiers.address);
		System.out.println(modifiers.name);
		//System.out.println(modifiers.age);//we can not access because it is private
		modifiers.publicMethod();
		modifiers.protectedMethod();
		modifiers.defaultMethod();
		//modifiers.privateMethod();//private method cannot access in another class

		
	}

}
