package com.Nov24Day15StringClassAssignment;

public class ReverseWordsInString_6 {
	String name = "Corenuts Technologies Pvt Ltd ";

	public void reverseWords() {
		String res = "";
		int c=0;

		for(int i=0;i<=name.length()-2;i++)
		{
			char ch=name.charAt(i);
			if(ch==' ') {

				c++;
				String res1="";

				for(int i1=i+1;ch!=name.charAt(i1);i1++)
				{
				 res1=name.charAt(i1)+res1;
				 i=i1;
				}

				res=res+" "+res1;
			}
			else
			{
				res=ch+res;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		ReverseWordsInString_6 string = new ReverseWordsInString_6();
		string.reverseWords();
	}
}
