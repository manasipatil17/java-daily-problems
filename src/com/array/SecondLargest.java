package com.array;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]= {23,12,54,33,76,43};
	int largest= Integer.MIN_VALUE;
	int secLargest= Integer.MIN_VALUE;
	
	for(int n:arr) {
		if(n>largest) {
			secLargest=largest;
			largest=n;
		}
		else if(n>secLargest && n!=largest) {
			secLargest = n;
		}
	}
	System.out.println("Second largest element is "+secLargest);
}
}
