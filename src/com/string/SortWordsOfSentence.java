package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsOfSentence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
 	String[] str=s.split(" ");
 	
 	Arrays.sort(str);
 	
 	for (String string : str) {
		System.out.print(string+" ");
	}
	}
}
