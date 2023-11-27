package com.Nov27Day16WrapperClasses;

public class StringToPrimitive_3 
{
	public void primitive() {
		
	String intString="100";
	System.out.println(Integer.parseInt(intString));
	
	String longString="10023";
	System.out.println(Long.parseLong(longString));

	String byteString="78";
    System.out.println(Byte.parseByte(byteString));
    
    String shortString="1034";
    System.out.println(Short.parseShort(shortString));
    
    String floatString="334";
    System.out.println(Float.parseFloat(floatString));
    
    String doubleString="334.34";
    System.out.println(Double.parseDouble(doubleString));
    
    String charString="A";
   // System.out.println(Char.parseChar(charString));//not for Char
	
    String stringString="abc";
   // System.out.println(String.parseString(stringString));//no parseString method
	
	
	
	}
	public static void main(String[] args) {
		StringToPrimitive_3 stringToPrimitive=new StringToPrimitive_3();
		stringToPrimitive.primitive();
	}


}
