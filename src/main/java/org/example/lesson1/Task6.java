package org.example.lesson1;

/**
 * Подсчет появлений некоторого символа.
 * Написать программу, которая подсчитывает появления того или иного символа в заданной строке.
 */
public class Task6 {

    public static void main(String[] args) {
        String s = "skdhkaf";
        System.out.println(countRepeatChar(s,'k'));
    }


    public static int countRepeatChar(String s, char c) {
        return Task1.countSameChars(s).get(c);
    }
}
