package com.array;

import java.util.Arrays;

public class SwapTwoELements {
public static void main(String[] args) {
	
	int a[]= {11,22,33,44,43,21,65,67};
	
	for(int i=0;i<a.length;i+=2) {
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
