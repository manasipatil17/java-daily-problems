package com.string;

public class CountNumLetters {
public static void main(String[] args) {
	String s= "Manasi@123";
	
	 int lCount=0;
	 int nCount=0;
	 int sCount=0; 
	
	for(int i=0;i< s.length();i++) {
		
		if(Character.isLetter(s.charAt(i))) {
			lCount++;
		}
		else if(Character.isDigit(s.charAt(i))) {
			nCount++;
		}
		else {
			sCount++;
		}
	}
	System.out.println("Letters count : "+lCount);
	System.out.println("Numbers count : "+nCount);
	System.out.println("Symbols count : "+sCount);
}
}
