package com.array;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {23,12,54,33,76,43};
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    
    for(int i=0;i<a.length;i++) {
    	int temp;
    	if(a[i]>largest) {
    		temp=largest;
    		largest=a[i];
    		secLargest=temp;
    	}
    	else if(a[i]<largest && a[i]>secLargest) {
    		secLargest=a[i];
    	}
    	
    }
    System.out.println("Second largest element is "+secLargest);
}
}
