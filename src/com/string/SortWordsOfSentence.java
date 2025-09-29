package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsOfSentence {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter sentence : ");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		
		String a[]=s.split(" ");
		Arrays.sort(a);
		
//		for (String s1 : a) {
//			System.out.print(s1+" ");
//			
//		}
		System.out.println(String.join(" ", a));
	}
}
