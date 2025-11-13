package com.array;

public class SecondSmallest {
public static void main(String[] args) {
	int a[]= {12,32,56,45,67};
	int smallest=Integer.MAX_VALUE;
	int secSmallest=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]<smallest) {
			int temp=smallest;
			smallest=a[i];
			secSmallest=temp;	
		}
		else if(a[i]>smallest&& a[i]<secSmallest) {
			secSmallest=a[i];
		}
	}
	System.out.println("Smallest element is "+smallest);	
System.out.println("Smallest element is "+secSmallest);	
}
}
