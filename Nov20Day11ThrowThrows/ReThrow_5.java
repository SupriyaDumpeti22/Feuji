package com.Nov20Day11ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrow_5 {
	public static void main(String[] args) {
		ReThrow_5 throw_5=new ReThrow_5();
		try {
			throw_5.reThrow();
		} catch (FileNotExist e) {
			e.printStackTrace();
		}
	}

	public void reThrow() throws FileNotExist {
		try {
			FileInputStream fileInputStream=new FileInputStream("supriya.txt");
		} catch (FileNotFoundException e) {
             throw new FileNotExist("file does not exist");			
		}
	
	}
}
