package com.prac;

import java.util.Scanner;

public class SumOf1stNNum {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter limit in digit");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
