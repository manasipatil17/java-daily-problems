package com.patterns;

public class AcmeQues {
public static void main(String[] args) {

	int n=7;
	
	for(int i=1;i<=n;i++) {
		int num=i*10;
		for(int j=1;j<=i;j++) {
			if(j==1 && i==1) {
				System.out.print("*");
			}
			else if(j==1|| i%2==0) {
				System.out.print(num);
				num+=5;
			}
			else {
				System.out.print("* ");
			}
			
			
		}
		System.out.println();

	}
//	for(int i=1;i<=n;i++) {
//		int num=i*10;
//		for(int j=1;j<=i;j++) {
//		if(i==1 && j==1) {
//			System.out.print("*");
//		}
//		else if( i%2==0 || j==1) {
//			System.out.print(num);
//		}
//		else {
//			System.out.print(" *");
//		}
//		num+=5;
//	}
//	System.out.println();
//
//}
}
}
