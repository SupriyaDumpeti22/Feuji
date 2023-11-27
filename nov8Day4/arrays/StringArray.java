package com.nov8Day4.arrays;

public class StringArray {

	void array() {

		String stringArray[] = new String[5];
		stringArray[0] = "sai";
		stringArray[1] = "sonu";
		stringArray[2] = "subbu";
		stringArray[3] = "mental";
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);
	}

	public static void main(String[] args) {

//		StringArray stringArray=new StringArray();
//		stringArray.array();

		Array1 array1 = new Array1();
		array1.stringArray(new String[]{ "subbu", "psycho", "sai", "sonu" });
		
		Array2 array2=new Array2();
		 String StringArray[]=array2.stringArray();
		 System.out.println(StringArray[1]);

	}

}

class Array1 {

	public void stringArray(String[] strings) {
//		String stringArray[]= {"subbu","psycho","sai","sonu"};
//		System.out.println(stringArray[1]);
		System.out.println(strings[2]);
		System.out.println(strings[1]);

	}
}

class Array2 {
	public String[] stringArray() {
		String stringArray[]= {"subbu","psycho","sai","sonu"};
        return stringArray;
		
	}

}
