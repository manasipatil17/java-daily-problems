package com.string;

public class CountCharacters {
	//WAP to accept name of the user and count the number of characters in it. 
	
public static void main(String[] args) {
	String name="Manasi Patil";
	int count=0;
	for(int i=0;i<name.length();i++) {
		if(Character.isLetter(name.charAt(i))) {
			count++;
		}
	}
	System.out.println(count);
}
}
