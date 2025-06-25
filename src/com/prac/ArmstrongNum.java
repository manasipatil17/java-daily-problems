package com.prac;

public class ArmstrongNum {
public static void main(String[] args) {
	int num=153;
	int rem=0;
	int power=0;
	int num2=num;
	int n=0;
	int temp=0;
	while(num!=0) {
		num=num/10;
		power++;
	}
	
	num=num2;
	while(num!=0) {
		rem=num%10;
		temp=(int)Math.pow(rem, power);
		n=n+temp;
		num/=10;
	}
	if(num2==n) {
		System.out.println("Number is armstrong");
	}
	else {
		System.out.println("Number is not armstrong");
	}
	
}
}
