package com.string;

public class Compare2Strings {
public static void main(String[] args) {
	String s1="Manasi";
	String s2="Manesi";
	
	if(s1.length()!=s2.length()) {
		System.out.println("Strings are not equal");
	}
	boolean same=true;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=s2.charAt(i)) {
			same=false;			
			break;
		}
	
	}
	if(same==true) {
		System.out.println("Two strings are equal");
	}
	else {
		System.out.println("Strings are not equal");
	}
}
}
