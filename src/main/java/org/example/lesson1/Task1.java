package org.example.lesson1;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 * (РЕШЕНО)
 */
public class Task1 {

    public static void main(String[] args) {
        String s = "aldkaldkaldkaakl";
        System.out.println(countSameChars(s));
    }

    public static Map<Character, Integer> countSameChars(String s) {
        Map<Character, Integer> result = new HashMap<>();
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (result.containsKey(chars[i])) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars [j]) {
                    count++;
                    result.put(chars[i], count);
                }
            }
        }

        return result;
    }
}
