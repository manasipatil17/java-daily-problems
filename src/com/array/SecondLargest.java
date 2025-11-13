package com.array;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {23,12,54,33,76,43};
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    
    for(int i=0;i<a.length;i++) {
    	if(a[i]<largest && a[i]>secLargest) {
    		int temp=largest;
    		largest=a[i];
    		secLargest=temp;
    	}
    	else if(a[i]>largest) {
    		largest=a[i];
    	}
    }
    System.out.println("Largest element is "+largest);
    System.out.println("secLargest element is "+secLargest);

}
}
