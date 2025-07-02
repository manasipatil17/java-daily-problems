package com.string;

public class StrCompress {
public static void main(String[] args) {
	String s = "aaabbcccss";
    int count;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char curr = s.charAt(i);
        count = 1;

        while (i + 1 < s.length() && s.charAt(i + 1) == curr) {
            count++;
            i++;
        }

        result.append(curr).append(count);
    }

    System.out.println("Compressed: " + result.toString());
}
}
