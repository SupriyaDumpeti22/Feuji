package com.Nov20Day11ThrowThrows;

public class NestedTry_4 {

	public void nestedTry() {
		try {
			int i = 10;
			System.out.println(10 / i);
			try {
				int j = 0;
				System.out.println(10 / j);
			} catch (ArithmeticException ae) {
				System.out.println("can't didvide with zero");
			}
		} finally {
			System.out.println("execution completed");
		}

	}

	public static void main(String[] args) {
		NestedTry_4 try_4 = new NestedTry_4();
		try_4.nestedTry();
	}
}
