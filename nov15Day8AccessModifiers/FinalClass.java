package com.nov15Day8AccessModifiers;

public class FinalClass {

	final int id = 1;
	public final void finalMethod() {
		System.out.println("final Method");
	}

	public static void main(String[] args) {
		System.out.println("final class method");
	}

}

class Classes extends FinalClass{
	//public void finalMethod() {
		
	//}
	
}
