package com.Nov24Day15StringClass;

public class StringMethods {
	String name="Supriya";
	String clgname="avanthi supriya";
	char c='k';
	char d='h';
	public void contain() {
		System.out.println(clgname.contains(name));//false s is capital
		System.out.println(name.toLowerCase());
		System.out.println(clgname.contains(name));//false because we didn't assign modified value
		 name=name.toLowerCase();//supriya
		 System.out.println(clgname.contains(name));//true
	}
	public void concat() {
		System.out.println(name+clgname);//add two strings
		System.out.println(name.concat(clgname));//add two strings

	//	System.out.println(c+d);//add ascii values

	}
	public void empty() {
		String s="null";
		String s1="";
		String s3=new String();
		//String s3=new String();//error

		System.out.println(s.isEmpty());
	//	System.out.println(s.isBlank());//not for strings

		System.out.println(s1.isEmpty());//its empty
		System.out.println(s3.isEmpty());//its empty


	}
	
	public static void main(String[] args) {
		
		StringMethods methods=new StringMethods();
		//methods.contain();
		//methods.concat();
		methods.empty();

	}

}
