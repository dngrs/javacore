package com.dngrs.app.classwork.lesson10;

/**
 * Created by I. Odokienko on 11/7/16.
 */
public class StringExample {
    public static String convertCharToString(char[] chars) {
        String s = new String();
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
