package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateVal {
public static void main(String[] args) {
	String s="programming";
	
	Map<Character,Integer> m=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(m.containsKey(c)) {
			m.put(c, m.get(c)+1);
		}
		else {
			m.put(c, 1);
		}
	}
	for( Entry<Character,Integer> e: m.entrySet()) {
	if(e.getValue()>1) {
		System.out.println(e);
	}
}
}
}
