package com.Nov24Day15StringClassAssignment;

public class RepeatedCharInString_11 {

	public void repeatChar() {
		String name="subbu";
		String empty="";
		int c=0;
		for(int index=0;index<=name.length()-1;index++)
		{
			char ch=name.charAt(index);
			for(int index1=0;index1<=empty.length()-1;index1++)
			{
				char ch1=empty.charAt(index1);

				if(ch==ch1) 
				{
					c++;
					System.out.println(ch);
					break;

				}
			
			}
			empty=empty+ch;
		}
		//System.out.println(empty);
		System.out.println("repeated characters: "+c);

	}
	public static void main(String[] args) {
		RepeatedCharInString_11 string_11=new RepeatedCharInString_11();
		string_11.repeatChar();
	}
}
