package com.Nov24Day15StringClassAssignment;

public class ReverseWords_6 {
	String name="Corenuts Technologies Pvt Ltd";
	public void reverse() {
		String[] name2=name.split(" ", 4);
		String res=" ";
		for(int index=name2.length-1;index>=0;index--)
		{
			res=res+" "+name2[index];
		}
		   System.out.println(res);

		
	}
	public static void main(String[] args) {
		ReverseWords_6 words_6=new ReverseWords_6();
		words_6.reverse();
	}

}
