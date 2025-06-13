package com.string;

public class Palindrome {
	//Write a Java program to check if a string is a palindrome.

		public static void main(String[] args) {
			String a="aabaa";
			StringBuffer s=new StringBuffer(a);
			s.reverse();
			
			System.out.println(a);
			System.out.println(s);
		    if(s.toString().equals(a)) {
		    	System.out.println("Palindrome");
		    }
		    else{
		    	System.out.println("Not palindrome");
		    }
		}
}
