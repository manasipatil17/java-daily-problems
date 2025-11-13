package com.array;

import java.util.Arrays;

public class LargestElement {
public static void main(String[] args) {
	int a[]= {12,37,32,44,65,11};
	int largest=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
	System.out.println("Largest element is "+largest);
}}
