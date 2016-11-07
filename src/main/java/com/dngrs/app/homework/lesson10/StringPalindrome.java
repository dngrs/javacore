package com.dngrs.app.homework.lesson10;

import java.util.Stack;

/**
 * Created by I. Odokienko on 11/2/16.
 */
public class StringPalindrome {

    public static boolean isPalindromeCompareCharacters(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeCompareObjects(String str) {
        str = str.toLowerCase();
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equals(reverseStr);
    }

    public static boolean isPalindromeRecursively(String str) {
        str = str.toLowerCase();
        if (str.length() < 2) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindromeRecursively(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }


    public static boolean isPalindromeStrBuilder(String str) {
        str = str.toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindromeStack(String str) {
        str = str.toLowerCase();
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String strReverse = "";
        while (!stack.isEmpty()) {
            strReverse = strReverse + stack.pop();
        }
        return str.equals(strReverse);
    }
}
