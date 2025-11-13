package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates {
public static void main(String[] args) {
	
	
	int a[]= {12,22,33,22,11,44,55,22,33};
	
	Map<Integer, Integer> m=new HashMap<>();
	for(int i=0;i<a.length;i++) {
		if(m.containsKey(a[i])) {
			m.put(a[i], m.get(a[i])+1);
		}
		else {
			m.put(a[i],1);
		}
	}
	for(Entry<Integer, Integer> e:m.entrySet()) {
		if(e.getValue()>=2) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
	}
	
	}
}
