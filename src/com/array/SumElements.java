package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumElements {
	//Take 7 inputs from user , store them in an array and print the array
	public static void main(String[] args) {

		int num[]=new int[7];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter number ");
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		for(int n:num) {
			 sum+=n;
		}
		System.out.println("Sum of elements : "+sum);
	}

}
