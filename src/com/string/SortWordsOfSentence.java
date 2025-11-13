package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsOfSentence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Write sentence : ");
	String s=sc.nextLine();
	
	String[] s1=s.split(" ");
	Arrays.sort(s1);
	for( String a:s1) {
		System.out.print(a+" ");
	}
	}
}
