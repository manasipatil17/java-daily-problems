package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumElements {
	//Take 7 inputs from user , store them in an array and print the sum array
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
				int a[]=new int[7];
				int sum=0;
		System.out.println("Enter 7 numbers : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
