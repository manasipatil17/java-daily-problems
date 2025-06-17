package com.array;

public class SmallestNumber {
public static void main(String[] args) {
	int arr[]= {23,55,43,12,6,88};
	
	int smallest=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	System.out.println("Smallest number is "+smallest);
}
}
