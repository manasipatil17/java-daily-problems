package com.array;

public class SortArray {
public static void main(String[] args) {
	int a[]= {12,33,22,11,55,66,44};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1-i;j++) {
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
