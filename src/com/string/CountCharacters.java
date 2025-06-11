package com.string;

public class CountCharacters {
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
