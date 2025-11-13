package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsFromFruits {
public static void main(String[] args) {
	
	String a[]= {"manasi","ram","Raj"};
	int v[]= new int[3];
	
	for(int i=0;i<a.length;i++) {
		String s= a[i].toLowerCase();
        int count =0;
        char[] c=s.toCharArray();
        for (int j=0;j<c.length;j++) {
        	if(c[j]=='a'||c[j]=='e'||c[j]=='o'||c[j]=='i'||c[j]=='u') {
        		count++;
        	}
        }
        v[i]=count;
	}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(v));
	
//	Scanner sc=new Scanner(System.in);
//	String a[]=new String[5];
//	int v[]=new int[5];
//
//	System.out.println("Enter 5 fruit names : ");
//	for(int i=0;i<5;i++) {
//		a[i]=sc.nextLine();
//		int count =0;
//		String str=a[i].toLowerCase();
//		
//		for(int j=0;j<str.length();j++) {
//			char ch=str.charAt(j);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				count++;
//			}
//		}
//		v[i]=count;
//		
//	}
//	System.out.println("Array of Fruit names : "+Arrays.toString(a));
//	System.out.println("Number of vowels in each fruit name : "+Arrays.toString(v));
}
}
