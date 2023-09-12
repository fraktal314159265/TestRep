package org.example.lesson1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 * (РЕШЕНО)
 */
public class Task4 {

    public static void main(String[] args) {
        String s = "Jd627 l";
        String k = "394754698978675645354678962";
        System.out.println(validateStringContainsOnlyNumbers(s));
        System.out.println(validateStringContainsOnlyNumbers(k));
    }

    public static boolean validateStringContainsOnlyNumbers(String s) {
        Pattern pattern = Pattern.compile("\\d" + "{" + s.length() + "}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
