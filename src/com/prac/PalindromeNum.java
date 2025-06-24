package com.prac;

public class PalindromeNum {
public static void main(String[] args) {
	int num=23432;
	int n=num;
	int num2=0;
	int rem=0;
	while(num!=0) {
		rem=num%10;
		num2=10*num2+rem;
		num/=10;
	}
	
	if(n==num2) {
		System.out.println(n+" is palindrome");
	}
	else {
		System.out.println(n+" is not palindrome");
	}
	
}
}
