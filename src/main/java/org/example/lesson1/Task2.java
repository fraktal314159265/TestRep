package org.example.lesson1;

import java.util.HashMap;
import java.util.Map;

/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 * (РЕШЕНО)
 */
public class Task2 {
    public static void main(String[] args) {
        String s = "abbabb";
        System.out.println(getFirstUniqueChar(s));
    }
    public static Character getFirstUniqueChar(String s) {
        char [] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Character c = null;
        for(int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                continue;
            }
            int count = 0;
            for(int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    map.put(chars[i], count);
                }
            }
            if (count == 1) {
                return chars[i];
            }
        }
        return c;
    }
}
