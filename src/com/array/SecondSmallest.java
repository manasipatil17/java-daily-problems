package com.array;

public class SecondSmallest {
public static void main(String[] args) {
	int arr[]= {12,32,56,45,67};
	
	int smallest=Integer.MAX_VALUE;
	int secSmallest=Integer.MAX_VALUE;
	
	for(int n:arr) {
		if(n<smallest) {
			secSmallest=smallest;
			smallest=n;
		}
		else if(n<secSmallest && n!=smallest) {
			secSmallest=n;
		}
	}
	System.out.println("Second smallest number is "+secSmallest);
}
}
