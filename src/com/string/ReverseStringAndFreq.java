package com.string;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class ReverseStringAndFreq {
public static void main(String[] args) {
	String s="I love my country";
	String s1=s.toLowerCase();
	String str[]=s1.split(" ");
	
	for(int i=str.length-1;i>=0;i--) {
		System.out.print(str[i]+" ");
	}
	System.out.println();
	Map<String, Integer> m=new HashMap<>();
	for (String string : str) {
		if(m.containsKey(string)) {
			m.put(string, m.get(str)+1);
		}
		else {
			m.put(string, 1);
		}
	}
	for (Map.Entry<String, Integer> string :m.entrySet()) {
		System.out.println(string.getKey()+" = "+string.getValue());
		
	}
}
}
