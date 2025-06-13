package com.string;

public class LengthWithoutMethod {
	//Write a Java program to find the length of a string without using .length().
	public static void main(String[] args) {
		String s="Manasi";
		int count=0;
		char[] s1=s.toCharArray();
		
		for(char c :s1) {
		count++;	
		}
		System.out.println("length of string is "+count);
	}

}
