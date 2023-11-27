package com.Nov20Day11ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Rose extends Flower {
	int i=0;
	public void colour() {
		System.out.println("red");
	}
	
	@Override
	public void petals() throws FileNotFoundException {
		//super.petals();
		System.out.println(10/i);
		FileInputStream fileInputStream=new FileInputStream("supriya.txt");


	}

//	public void fileException()  throws FileNotFoundException{
//		FileInputStream fileInputStream=new FileInputStream("supriya.txt");
//	}
	public static void main(String[] args) {
		Rose rose=new Rose();
		//rose.petals();
	}

}
