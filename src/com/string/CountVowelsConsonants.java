package com.string;

public class CountVowelsConsonants {
public static void main(String[] args) {
	String s="India is my country";
	String[] s1=s.trim().split("\\s+");
	int countv=0;
	int countc=0;
	for(int i=0;i<s.length();i++) {
		char c= s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			countv++;
		}
		else {
			countc++;
		}
	}
	System.out.println("Total vowels : "+countv);
	System.out.println("Total consonants : "+countc);
}
}
