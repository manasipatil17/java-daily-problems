package com.prac;

public class CountDight {
public static void main(String[] args) {
int num=1234522;
int count = 0;
 while(num>0) {
	 count++;
	 num/=10;
	 
 }
 System.out.println("count of digits present : "+count);
}
}
