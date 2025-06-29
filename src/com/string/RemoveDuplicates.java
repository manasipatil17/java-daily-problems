package com.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String s= "Programming";
	StringBuilder add=new StringBuilder();
	Set seen=new HashSet();
	for(char n:s.toCharArray()) {
		if(!seen.contains(n)) {
			seen.add(n);
			add.append(n);
		}
	}
	System.out.println(add);
}
}
