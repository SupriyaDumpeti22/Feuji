package com.Nov20Day11ThrowThrows;

public class FileNotExist extends Exception {

	String messege;

	public FileNotExist(String messege) {
		super(messege);
	}
	
}
