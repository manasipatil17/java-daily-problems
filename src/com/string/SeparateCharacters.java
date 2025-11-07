package com.string;

public class SeparateCharacters {
public static void main(String[] args) {
	String s="asfg1234&^%$adfgh";
	
	StringBuilder letters= new StringBuilder();
	StringBuilder numbers= new StringBuilder();
	StringBuilder symbols= new StringBuilder();
	
	char[] str=s.toCharArray();
	for (char c : str) {
		if(Character.isLetter(c)) {
			letters.append(c);
		}
		else if(Character.isDigit(c)) {
			numbers.append(c);
		}
		else {
			symbols.append(c);
		}
	}
	System.out.println(letters);
	System.out.println(numbers);
	System.out.println(symbols);
//	for(char c:s.toCharArray()) {
//		if(Character.isLetter(c)) {
//			letters.append(c);
//		}
//		else if (Character.isDigit(c)) {
//			numbers.append(c);
//		}
//		else {
//			symbols.append(c);
//		}
//	}
//	System.out.println("Original string : "+s);
//	System.out.println("Letters : "+letters);
//	System.out.println("Numbers : "+numbers);
//	System.out.println("Symbols : "+symbols);
}
}
