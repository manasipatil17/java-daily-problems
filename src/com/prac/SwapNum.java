package com.prac;

public class SwapNum {
//Swap two numbers without using third variable
	public static void main(String[] args) {
		int a=12;
		int b=45;
		
		 a=a+b;
		 b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
				
	}
}
