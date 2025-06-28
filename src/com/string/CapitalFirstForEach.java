package com.string;

public class CapitalFirstForEach {
public static void main(String[] args) {
	String s="java is programming language";
	
	char[] c=s.toCharArray();
	
	if(Character.isLetter(c[0])) {
		c[0] = Character.toUpperCase(c[0]);
	}
	for(int i=1;i<c.length;i++) {
		if(c[i-1]==' ' && Character.isLetter(c[i])) {
		c[i]=Character.toUpperCase(c[i]);
		}
	}
	String s1=new String(c);
	System.out.println(c);
}
}
