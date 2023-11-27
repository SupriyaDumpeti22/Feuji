package com.Nov20Day11ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException_1 {

        public static void main(String[] args)  
        {
			
		}
        public void exception() throws FileNotFoundException
        {
         FileInputStream fileInputStream=new FileInputStream("raaji.txt");
        
        }
       
        
}

