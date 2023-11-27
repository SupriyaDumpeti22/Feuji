package com.Nov24Day15StringClassAssignment;

import java.util.StringTokenizer;

public class TokenizedString_7 {
	public void tokens() {
		String name="Corenuts Feuji Technologies Private Limited";
		String[] name1=name.split(" ");
		for(int index=0;index<=name1.length-1;index++)
		{
			System.out.println(name1[index]);
		}
	}
	
	public void tokenizer() {
		String name="Corenuts Feuji Technologies Private Limited";
        StringTokenizer tokenizer=new StringTokenizer(name," ");
        String res="";
        while(tokenizer.hasMoreTokens())
        {
        	 res=tokenizer.nextToken();
             System.out.println(res);

        }
	}
	public static void main(String[] args) {
		TokenizedString_7 string_7=new TokenizedString_7();
		//string_7.tokens();
		string_7.tokenizer();

	}

}
