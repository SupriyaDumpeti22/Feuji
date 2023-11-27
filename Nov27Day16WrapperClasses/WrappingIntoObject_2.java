package com.Nov27Day16WrapperClasses;

public class WrappingIntoObject_2 {

	public void wrapping() {

		byte byteValue = 23;
		Byte byteObj = Byte.valueOf(byteValue);
		System.out.println(byteObj);

		short shortValue = 12;
		Short shortObj = shortValue;
		System.out.println(shortObj);

		int intValue = 10;
		Integer intObj = intValue;
		System.out.println(intObj);

		long longValue = 10;
		Long longObj = longValue;
		System.out.println(longObj);

		Double doubleObj = new Double(234.4);
		System.out.println(doubleObj);

		Float floatObj = new Float(200.4);
		System.out.println(floatObj);

		boolean bValue = true;
		Boolean bObj = Boolean.valueOf(bValue);
		System.out.println(bObj);

	}

	public static void main(String[] args) {
		WrappingIntoObject_2 object = new WrappingIntoObject_2();
		object.wrapping();
	}

}
