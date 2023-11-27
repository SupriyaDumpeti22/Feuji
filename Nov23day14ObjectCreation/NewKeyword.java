package com.Nov23day14ObjectCreation;

public class NewKeyword {

	String name="supriya";
	public void method(){
		System.out.println(name);
	}
	public static void main(String[] args) {
		
	NewKeyword newKeyword=new NewKeyword();//creating object  by new keyword
	newKeyword.method();
	}
}
