package com.string;

public class PalindromeWithoutmethod {

	public static void main(String[] args) {
		String s= "rajar";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
		s1+=s.charAt(i);
		}
		
		if(s.equals(s1)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
	
}
