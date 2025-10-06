package com.string;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="silent";
	String s2="listen";
	
	if(s1.length()==s2.length()) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
	}
	else {
		System.out.println("String is not anagram");
	}
}
}
