package com.Nov24Day15StringClassAssignment;

public class InsertString_9 {
	public void insertString()
	{
		StringBuffer buffer=new StringBuffer("Corenuts Pvt Ltd");
		buffer.insert(buffer.indexOf(" ")," technologies");
		System.out.println(buffer);
	}
	public static void main(String[] args) {
		InsertString_9 insertString=new InsertString_9();
		insertString.insertString();
	}

}
