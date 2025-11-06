package com.array;

public class SqrOfMaxElement {
public static void main(String[] args) {
	int a[]= {11,21,33,1,55,34,89,53};
       int max=Integer.MIN_VALUE;
       
       for(int i=0;i<a.length;i++) {
    	   if(a[i]>max) {
    		   max=a[i];
    	   }
       }
       int sqr=max*max;
       System.out.println("Max element of array is "+max);
       System.out.println("Square of Max element of array is "+sqr);
}
}
