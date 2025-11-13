package com.array;

import java.util.Scanner;

public class DuplicateOccurence {
// to print occurences of inputted value
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int n;
	System.out.println("Enter number : ");
	n=sc.nextInt();
	int[] a= {12,33,22,12,55,33,11,12};
	int count = 0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			count++;
		}
	}
	System.out.println("Occurence of "+n+" is "+count);
}

}
