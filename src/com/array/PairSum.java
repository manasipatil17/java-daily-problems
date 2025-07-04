package com.array;

public class PairSum {
public static void main(String[] args) {
	int[] a= {1,9,2,7,8,3,4,6};

	int sum=10;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]+a[j]==sum) {
			System.out.println("("+a[i]+","+a[j]+")");
		}
	}
}
}
}