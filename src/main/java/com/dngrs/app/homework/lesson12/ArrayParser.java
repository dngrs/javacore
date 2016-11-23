package com.dngrs.app.homework.lesson12;

/**
 * Created by I. Odokienko on 11/12/16.
 */
public class ArrayParser {
    public static int[] parseArray(String input, String separator) {
        String[] splittedString = input.split(separator);
        int[] array = new int[splittedString.length];
        for (int i = 0; i < splittedString.length; i++) {
            array[i] = Integer.valueOf(splittedString[i]);
        }
        return array;
    }
}
