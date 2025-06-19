package com.array;

import java.util.Arrays;

public class Even {
	//create an array of 10 number, print only sum numbers
	
		public static void main(String[] args) {

			int num[]= {11,12,13,14,15,16,17,18,19,20};
			System.out.println(Arrays.toString(num));
			System.out.println("Even numbers from given array :");
			for(int n:num) {
				if(n%2==0) {
					System.out.print(n+" ");
					
				}
			}

		}
}
