package HashMaps;

import java.util.*;
import java.util.HashMap;

public class RomanIteration {
    private static final Map<Character, Integer> romanValueMap = new TreeMap<>();

    static {
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);
    }

    public static String toRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : romanValueMap.entrySet()) {
            while (num >= entry.getValue()) {
                sb.append(entry.getKey());
                num -= entry.getValue();
            }
        }
        return sb.toString();
    }

    public static int minBase(String roman) {
        for (int base = 2; base <= 36; base++) {
            int value = 0;
            for (char c : roman.toCharArray()) {
                int charValue = romanValueMap.getOrDefault(c, 0);
                if (charValue == 0 || charValue >= base) {
                    return -1; // Invalid Roman numeral for the base
                }
                value = value * base + charValue;
            }
            return value;
        }
        return -1; // Roman numeral doesn't represent a valid number in any base
    }

    public static int solve(int N) {
        while (N >= 1 && N <= 3999) {
            String roman = toRoman(N);
            int base = minBase(roman);
            if (base == -1) {
                return N; // Invalid Roman numeral
            }
            N = minBase(roman);
        }
        return N;
    }

    public static void main(String[] args) {
        int N = 1; // Change this to your desired input
        int result = solve(N);
        System.out.println(result);
    }

}
