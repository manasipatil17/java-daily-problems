package com.prac;

import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number : ");
	int a= sc.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
	if(a%i==0) {
		count++;
	}
}
	if(count==2) {
		System.out.println("Number is prime");
	}
	else {
		System.out.println("Number is not prime");
	}
	
	sc.close();
}
}