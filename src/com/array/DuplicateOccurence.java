package com.array;

import java.util.Scanner;

public class DuplicateOccurence {
// to print occurences of inputted value
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int n;
	System.out.println("enter value : ");
	n=sc.nextInt();
	
	int a[]= {12,3,44,2,55,4,3,22};
	int c=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			c++;
		}
	}
	System.out.println("appearance of "+n+" is " +c+ " times");
}

}
