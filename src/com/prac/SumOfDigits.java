package com.prac;

public class SumOfDigits {
public static void main(String[] args) {
	int n=43256;
	int sum=0;
	int rem;
	while(n!=0) {
		rem=n%10;
		sum+=rem;
		n=n/10;
	}
	System.out.println("Sum of number is "+sum);
}
}
