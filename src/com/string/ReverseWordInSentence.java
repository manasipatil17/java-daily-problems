package com.string;

public class ReverseWordInSentence {
public static void main(String[] args) {
	String s= "Java is fun";
     String[] a=s.split(" ");
     
     for(int i =a.length-1;i>=0;i--) {
    	 System.out.print(a[i]+" ");
     }
	
	
}
}
