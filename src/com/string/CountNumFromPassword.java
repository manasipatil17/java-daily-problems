package com.string;

public class CountNumFromPassword {
	//WAP to accept password of the user and count the number of digits in it. 
	public static void main(String[] args) {
		String pass="Manasi@2004";
		int count=0;
		for(int i=0;i<pass.length();i++) {
			if(Character.isDigit(pass.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total numbers in password : "+count);
	}
}
