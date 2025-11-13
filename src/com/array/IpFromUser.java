package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class IpFromUser {
	//take 5 numbers input from user , store them in an array and print the array
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
	}
}
