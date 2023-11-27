package com.Nov24Day15StringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("supriya");
		StringBuffer name2=new StringBuffer("supriya");

		name.append("a");
		System.out.println(name);
		StringBuffer name1=new StringBuffer("supriyaa");
		System.out.println(name1);
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));


 
	}
}
