package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class IpFromUser {
	//take 5 numbers input from user , store them in an array and print the array
	public static void main(String[] args) {
		
		int num[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(num));
	}
}
