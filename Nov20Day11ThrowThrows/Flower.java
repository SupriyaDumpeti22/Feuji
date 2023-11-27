package com.Nov20Day11ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Flower {
	
	public void smells() {
		System.out.println("it smells");
	}
	public void petals() throws IOException  {
		System.out.println("it has petals");
		//FileInputStream fileInputStream=new FileInputStream("supriya.txt");

	}

}
