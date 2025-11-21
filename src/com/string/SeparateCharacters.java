package com.string;

public class SeparateCharacters {
public static void main(String[] args) {
	String s="asfg1234&^%$adfgh";
	char[] ch=s.toCharArray();
	
	StringBuilder letter=new StringBuilder();
	StringBuilder number=new StringBuilder();
	StringBuilder symbol=new StringBuilder();
	for(char c:ch) {
		
		if(Character.isLetter(c)) {
			letter.append(c);
		}
		else if(Character.isDigit(c)) {
			number.append(c);
		}
		else {
			symbol.append(c);
		}
	}
	System.out.println("Letters : "+letter);
	System.out.println("Numbers : "+number);
	System.out.println("Symbols : "+symbol);
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
