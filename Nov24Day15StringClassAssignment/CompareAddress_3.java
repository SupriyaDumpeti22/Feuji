package com.Nov24Day15StringClassAssignment;

public class CompareAddress_3 {
	public void compareAddress() {
		
		String name=new String("supriya");
		String name2=new String("supriya");
		String name3=name;
		System.out.println(name==name2);
		System.out.println(name==name3);

	}

	public static void main(String[] args) {
		CompareAddress_3 address=new CompareAddress_3();
		address.compareAddress();
	}
}
