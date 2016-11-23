package com.dngrs.app.homework.lesson12;

/**
 * Created by I. Odokienko on 11/13/16.
 */
public class PrintLetters {
    public static String printLetters(String str) {
        StringBuilder result = new StringBuilder();
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            if ((array[i].length() == 1) && (array[i].matches("[a-zA-Z]"))) {
                result.append(array[i]);
            }
        }
        return result.toString();
    }
}
