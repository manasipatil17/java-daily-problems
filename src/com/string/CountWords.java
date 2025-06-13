package com.string;

public class CountWords {
	//Write a Java program to count the number of words in a string.

	public static void main(String[] args) {
		String s="  India is my country";
		
		String s1[]=s.trim().split("\\s+");
		int count =s1.length;
		System.out.println("words in given string : "+count);
		
		//OR
		
		int count1=0;
		s.trim();
		for(int i=0;i<s.length();i++) {
			if(i!=0) {
			if(s.charAt(i)!=' '&& s.charAt(i-1)==' ') {
				count1++;
			}
			}
		}
		System.out.println(count);
		
	}
}
