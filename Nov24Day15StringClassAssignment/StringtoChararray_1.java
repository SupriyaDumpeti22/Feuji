package com.Nov24Day15StringClassAssignment;

public class StringtoChararray_1 {
	String name="supriya";
	public void charArray() {
		// System.out.println(name.toCharArray());//supriya
		char charArray[]=name.toCharArray();
		for(int index=0;index<=charArray.length-1;index++)
		{
			System.out.println(charArray[index]);
		}
	}
	public static void main(String[] args) {
		StringtoChararray_1 chararray=new StringtoChararray_1();
		chararray.charArray();
	}

}
