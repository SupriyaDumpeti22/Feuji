package com.Nov23day14ObjectCreation;

public class Clone implements Cloneable {
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	String name="supriyaa";
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone clone1=new Clone();
		Clone clone2=(Clone)clone1.clone();
		System.out.println(clone2.name);
	}

}
