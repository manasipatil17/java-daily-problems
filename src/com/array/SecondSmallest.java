package com.array;

public class SecondSmallest {
public static void main(String[] args) {
	int a[]= {12,32,56,45,67};
	
	int smallest=Integer.MAX_VALUE;
	int secSmallest= Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++) {
		int temp;
		if(a[i]<smallest && a[i]<secSmallest) {
			temp=smallest;
			smallest=a[i];
			secSmallest=temp;
		}
		else if(a[i]<secSmallest && a[i]>smallest) {
			secSmallest=a[i];
		}
	}
	System.out.println("Second smallest element is "+secSmallest);
	}
}
