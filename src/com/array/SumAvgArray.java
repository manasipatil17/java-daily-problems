package com.array;

public class SumAvgArray {
public static void main(String[] args) {
	int a[]= {11,22,44,32,43,64};
	int sum=0;
	int avg=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	avg=sum/a.length;
	
	System.out.println("Sum of an array : "+sum);
	System.out.println("Avg of an array : "+avg);
}
}
