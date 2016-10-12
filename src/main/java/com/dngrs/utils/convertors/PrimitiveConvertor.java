package com.dngrs.utils.convertors;

/**
 * Created by admin on 10/10/16.
 */
public class PrimitiveConvertor {
    public static char floatToChar(float f){
        char c = (char)f;
        System.out.println("Input float value is " + f + ". Output char value is " + c);
        return c;
    }

    public static char intToChar(int i){
        char c = (char)i;
        System.out.println("Input int value is " + i + ". Output char value is " + c);
        return c;
    }

    public static int charToInt(char c){
        int i = c;
        System.out.println("Input char value is " + c + ". Output int value is " + i);
        return i;
    }
}
