package com.Nov27Day16WrapperClasses;

public class W2P_P2W_7 {

	int intValue = 10;
	Integer intObj = intValue;// wrapping
	int intValue2 = intObj;// unWrapping

	Long longValue = Long.valueOf(2455); // wrapping
	long l = longValue.longValue();// unwrapping

	char charValue = 's';
	Character charObj = new Character('a');// wrapping
	char c = charObj;// unwrapping

}
