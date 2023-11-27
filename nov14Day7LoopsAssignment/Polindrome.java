package com.nov14Day7LoopsAssignment;

public class Polindrome {
	public void polindrome() {
		String num="1221";
		String num2="";
		int length=num.length()-1;
		for(int index=0;index<=length;index++)
		{
			char ch=num.charAt(index);
			num2=ch+num2;
		}
		System.out.println(num2);
		if(num.equals(num2))
		{
			System.out.println(num2 +" is a polindrome");
		}
		else
		{
			System.out.println("is  not a polindrome");

		}
	}
	public void polindrome2() {
		
		int value=1221;
		int res=0;
		while(value!=0)
		{
		  int last=value%10;
		 res =res*10+last;
		 value=value/10;

		}
		System.out.println(res);
		if(value==res)
		{
			System.out.println(value+"is polindrome");
		}
		else
		{
			System.out.println("is  not a polindrome");

		}


	}

	public static void main(String[] args) {

		Polindrome polindrome=new Polindrome();
		//polindrome.polindrome();
		polindrome.polindrome2();
	}

}
