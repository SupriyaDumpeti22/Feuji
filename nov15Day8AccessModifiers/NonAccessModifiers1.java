package com.nov15Day8AccessModifiers;

public abstract class NonAccessModifiers1{

	final int id=1;
	String name="supriya";
	
	final void finalMethod() {
		System.out.println("final method");
	}
	abstract void abstractMethod();
	
	
	public static void main(String[] args) {
		//NonAccessModifiers1 modifiers1=new NonAccessModifiers1();//we can not create object to abstract class
		AccessModifier accessModifier=new AccessModifier();
          accessModifier.abstractMethod();
		
	}


}

class  AccessModifier extends NonAccessModifiers1{
	public void abstractMethod() {
		System.out.println("abstractMethod");
		
		System.out.println(id);
		AccessModifier accessModifier=new AccessModifier();
        accessModifier.finalMethod();
		
	}
	//public void finalMethod() {//not possible  we can not override final methods
	//System.out.println();
	}
	
	

