package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsFromFruits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a[]=new String[5];
	int v[]=new int[5];

	System.out.println("Enter 5 fruit names : ");
	for(int i=0;i<5;i++) {
		a[i]=sc.nextLine();
		int count =0;
		String str=a[i].toLowerCase();
		
		for(int j=0;j<str.length();j++) {
			char ch=str.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		v[i]=count;
		
	}
	System.out.println("Array of Fruit names : "+Arrays.toString(a));
	System.out.println("Number of vowels in each fruit name : "+Arrays.toString(v));
}
}
