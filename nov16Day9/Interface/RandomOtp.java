package com.nov16Day9.Interface;

import java.util.Random;

public class RandomOtp {
	public void ranodmOtp() {
		Random random=new Random();
		String otp="";
		for(int index=1;index<=4;index++)
		{
		   int value=random.nextInt(10);
		   otp=otp+value;
		}
		System.out.println(otp);
	}

	public static void main(String[] args) {

		RandomOtp randomOtp=new RandomOtp();
		randomOtp.ranodmOtp();
//		int a=(int)(Math.random()*10);
//		System.out.println(a);
	}

}
