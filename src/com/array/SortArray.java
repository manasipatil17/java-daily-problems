package com.array;

public class SortArray {
public static void main(String[] args) {
	int a[]= {12,33,22,11,87,66,44};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
		for(int n : a) {
		System.out.print(n+" ");
	}
}
}
//i represents the number of passes.
//With each pass, the largest element "bubbles" to the end, so there's no need to compare it again.
//That's why we do a.length - 1 - i — to avoid redundant comparisons of already sorted elements.

