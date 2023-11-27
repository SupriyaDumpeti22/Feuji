package com.Nov20Day11ThrowThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CallerClass_7 extends CallingClass_7{
	public void callerMethod() throws IOException {
		CallingClass_7 callingClass_7=new CallingClass_7();
		try {
			callingClass_7.callingMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found exception");
		}
	}
	public static void main(String[] args) throws IOException {
		CallerClass_7 class_7=new CallerClass_7();
		class_7.callerMethod();
	}

}
