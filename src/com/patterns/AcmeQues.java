package com.patterns;

public class AcmeQues {
public static void main(String[] args) {
	int n=7;
	int c=20;
	
	for(int i=1;i<=n;i++) {
	int row=i;
	if(i%2==0) {
	for(int j=1;j<=i;j++) {
		System.out.print(c);
		c+=5;
	}
	}
	else {
        // For odd rows, print stars equal to row number - 1
        int stars = (i == 1) ? 1 : i;
        for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
        }
    }

	System.out.println();
	}
	}
	
}
