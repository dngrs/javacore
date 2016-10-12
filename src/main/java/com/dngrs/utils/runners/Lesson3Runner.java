package com.dngrs.utils.runners;
import com.dngrs.utils.convertors.*;

/**
 * Created by admin on 10/10/16.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(65.5f);
        convertor.intToChar(Integer.MIN_VALUE);
        convertor.charToInt('#');
    }
}
