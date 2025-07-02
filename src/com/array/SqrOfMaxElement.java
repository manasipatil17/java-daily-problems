package com.array;

public class SqrOfMaxElement {
public static void main(String[] args) {
	int a[]= {11,21,33,1,55,34,89,53};
	
	int max=a[0];
	int sqr;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	sqr=max*max;
	
	System.out.println("Greatest element from array : "+max);
	System.out.println("Square of greatest number : "+sqr);
}
}
