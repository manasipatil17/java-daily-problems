package com.array;

public class DuplicatesByLoop {
public static void main(String[] args) {
	int arr[]= {11,32,12,7,65,43,22,12,32};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
		System.out.print(arr[i]+" ");
			}
	}
}
}
}
