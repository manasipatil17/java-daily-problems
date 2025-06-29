package com.array;

public class MinMaxInArray {
//Find the largest and smallest element in an array
	
	public static void main(String[] args) {
		int a[]= {11,23,1,44,67,33};
		
		int min=a[0];
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("Smallest element in array : "+min);
		System.out.println("Largest element in array : "+max);
		
	}
}
