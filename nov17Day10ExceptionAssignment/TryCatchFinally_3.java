package com.nov17Day10ExceptionAssignment;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinally_3 {
	public void fileNotFoundException() {
		FileInputStream fileInputStream=null;
		
		try {
			 fileInputStream=new FileInputStream("C:\\Users\\Supriya\\OneDrive\\Desktop\\INSTITUTE\\ JAVA\\SpringBootConfiguration.txt");
			int value1=12,value2=20;
			System.out.println(value1+value2);
		} 
		//System.out.println("try block ended");//we can not mention statements in between try and catch blocks
		catch (Exception e) 
		{
			System.out.println("File is not found mention corect file path");
			e.printStackTrace();
		}
		finally {
			System.out.println(10+12);
			if(fileInputStream!=null)
			{
				try 
				{
					fileInputStream.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}			
		}	
	}
	public static void main(String[] args) {
		TryCatchFinally_3 tryCatchFinally=new TryCatchFinally_3();
		tryCatchFinally.fileNotFoundException();
	}

}
