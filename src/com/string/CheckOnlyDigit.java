package com.string;

public class CheckOnlyDigit {
//Check if string contains only digits
	
	public static void main(String[] args) {
		String s="12g3456";
		boolean isDigit=true;
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) {
				isDigit=false;
				break;
			}
		}
		if(isDigit==true) {
			System.out.println("String contains only digits");
		}
		else {
			System.out.println("String does not contains only digits");
		}
		
	}
}
