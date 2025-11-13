package com.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = m.get(s.charAt(i));
            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }
            prevValue = current;
        }

        return total;
    }
public static void main(String[] args) {
	RomanToInt r=new RomanToInt();
	System.out.println(r.romanToInt("IXXV"));
	}
}
