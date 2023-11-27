package com.Nov20Day11ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException_1 {

	public void throwException() throws FileNotFoundException
	{
		FileInputStream fileInputStream=new FileInputStream("raaji.txt");	
		
	}
	public static void main(String[] args) {
		
		ThrowException_1 exception_1=new ThrowException_1();
		try {
			exception_1.throwingException();
		} catch (FileInvalidExcception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
	}
	public void throwingException() throws FileInvalidExcception {
		
		throw new FileInvalidExcception("that file is not found");
	}
	
	
}