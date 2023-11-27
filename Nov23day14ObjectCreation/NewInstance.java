package com.Nov23day14ObjectCreation;

public class NewInstance {

	String name="supriya";
	public void method() {
		System.out.println(name);
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Class cl=Class.forName("NewInstance");
//		NewInstance instance=(NewInstance)cl.newInstance();
		NewInstance instance=NewInstance.class.newInstance();
		System.out.println(instance.name);
	}
	
	
	
}
