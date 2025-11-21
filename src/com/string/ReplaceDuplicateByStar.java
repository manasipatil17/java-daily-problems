package com.string;


//replace duplicates by *
public class ReplaceDuplicateByStar {
public static void main(String[] args) {
//	String org="satara";
//	String dup="";
//	
//	for(int i=0;i<org.length();i++) {
//		if(dup.indexOf(org.charAt(i))!=-1) {
//			dup+="*";
//		}
//		else {
//			dup+=org.charAt(i);
//		}
//	}
//	System.out.println(org);
//	System.out.println(dup);
//	
	
	String input = "programming";
    String result = replaceDuplicates(input);
    System.out.println("Original: " + input);
    System.out.println("Modified: " + result);
}

public static String replaceDuplicates(String str) {
    StringBuilder sb = new StringBuilder();
    boolean[] seen = new boolean[256]; // ASCII character map

    for (char c : str.toCharArray()) {
        if (seen[c]) {
            sb.append('*'); // replace duplicate
        } else {
            sb.append(c);   // keep first occurrence
            seen[c] = true;
        }
    }

    return sb.toString();
	
}
}
