package com.string;

public class ContainsDigitSum {

	public static void main(String[] args) {
		String s="15sman344";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				sum+=Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(sum);
	}
}
