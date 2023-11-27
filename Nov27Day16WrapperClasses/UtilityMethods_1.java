package com.Nov27Day16WrapperClasses;

public class UtilityMethods_1 {

	int intValue=10;
	Integer intObj=intValue;
	public void intMethod() {
		//System.out.println(intObj);
		Integer value1=200;//implicit boxing
		int a=Integer.valueOf("100");//explicit boxing
		System.out.println(a);
		int value=Integer.parseInt("200");//to get value from string
		System.out.println(value);
		Integer d=453;
		System.out.println(d.floatValue());//to unwrap onject into primitive
	}
	public void doubleMethod() {
		double dvalue=45.6;
		double a=Double.valueOf("100.34");//explicit boxing
		System.out.println(a);
		double value=Double.parseDouble("200.34");
		System.out.println(value);
		System.out.println(Double.min(23.4,34.5));
		System.out.println(Double.max(23.4,34.5));

	}
	public static void main(String[] args) {
		UtilityMethods_1 methods_1=new UtilityMethods_1();
		//methods_1.intMethod();
		methods_1.doubleMethod();

	}

}
