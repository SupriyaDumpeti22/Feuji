package com.nov16Day9.Interface;


public class Audi implements Sunroof{
	
	public static void main(String[] args) {
    Audi audi=new Audi();
    audi.roof();
}

	@Override
	public void roof() {

		System.out.println("roof");
	}
}
