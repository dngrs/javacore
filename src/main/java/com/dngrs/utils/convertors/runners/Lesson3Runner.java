package com.dngrs.utils.convertors.runners;

/**
 * Created by admin on 10/10/16.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(10f);
        convertor.intToChar(Integer.MIN_VALUE);
        convertor.charToInt('#');
    }
}