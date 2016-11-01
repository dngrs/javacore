package com.dngrs.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by admin on 10/29/16.
 */
public class CharArray {
    public static void main(String[] args) {
        char[] charArray = new char [256];
        for(int i = 0; i <charArray.length; i++){
            charArray[i] = (char)i;
        }
        System.out.println(Arrays.toString(charArray));
    }
}
