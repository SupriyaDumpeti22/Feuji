package com.nov15Day8AccessModifiers;

public class AllAccessModifiers{
	public int id=1;
	protected String name="supriya";
	String address="hyderabad";
	private int age=21;
	
	public void publicMethod() {
		System.out.println("public Method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method");
	}
	
	 void defaultMethod() {
		System.out.println("default Method");
	}
	 
	 private void privateMethod() {
			System.out.println("private Method");
		}

	public static void main(String[] args) {

		AllAccessModifiers modifiers=new AllAccessModifiers();
		System.out.println(modifiers.id);
		System.out.println(modifiers.address);
		System.out.println(modifiers.name);
		System.out.println(modifiers.age);
		modifiers.publicMethod();
		modifiers.protectedMethod();
		modifiers.defaultMethod();
		modifiers.privateMethod();


	}

}
