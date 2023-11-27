package com.Nov24Day15StringClassAssignment;

public class DeleteString_8 {
	public static void main(String[] args) {
		DeleteString_8 deleteString=new DeleteString_8();
		deleteString.deleteString();
	}
	public void deleteString() {
		StringBuffer name=new StringBuffer("Corenuts Technologies Pvt Ltd");
		name.delete(name.indexOf(" "),name.indexOf(" ",13));
		System.out.println(name);
	}

}
