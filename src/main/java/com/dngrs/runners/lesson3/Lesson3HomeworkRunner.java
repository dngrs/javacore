package com.dngrs.runners.lesson3;
import com.dngrs.utils.convertors.*;

/**
 * Created by admin on 10/10/16.
 */
public class Lesson3HomeworkRunner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(65.5f);
        convertor.intToChar(Integer.MIN_VALUE);
        convertor.charToInt('#');
    }
}
