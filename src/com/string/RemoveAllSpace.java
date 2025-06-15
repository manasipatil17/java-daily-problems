package com.string;

public class RemoveAllSpace {
	//Write a Java program to remove all white spaces from a string.
	public static void main(String[] args) {
		String s=" ma nas i ";
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);
	}
}
