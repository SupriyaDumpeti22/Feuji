package com.Nov24Day15StringClassAssignment;

public class StringReverse_5 {
	String company="Corenuts Technologies pvt ltd";
	String res="";
	public void reverseStringFor() {
		for(int index=company.length()-1;index>=0;index--)
		{
			res=res+company.charAt(index);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		StringReverse_5 reverse=new StringReverse_5();
		//reverse.reverseStringFor();
		//reverse.reverseStringBuffer();
		reverse.reverseCharArray();

	}
	public void reverseStringBuffer()
	{
		String name="Corenuts Technologies Pvt Ltddd";
		StringBuffer sb=new StringBuffer();
		sb.append(name);
		System.out.println(sb.reverse());
	}

	public void reverseCharArray() {
		String name="Corenuts Technologiessss Pvt Ltd";
        char  charArray[]=name.toCharArray();
        String res="";
        for(int index=charArray.length-1;index>=0;index--)
        {
        	res=res+charArray[index];
        }
    	System.out.println(res);

        
	}
}
