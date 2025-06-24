package com.prac;

public class CountDight {
public static void main(String[] args) {
	int number=32456;
	int count=0;
	while(number!=0) {
		count++;
		number=number/10;
	}
	System.out.println("Total digits : "+count);
}
}
