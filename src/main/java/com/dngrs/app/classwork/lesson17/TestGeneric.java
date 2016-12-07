package com.dngrs.app.classwork.lesson17;

/**
 * Created by I. Odokienko on 11/30/16.
 */
public class TestGeneric {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 =
                new BoxPrinterGeneric<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinterGeneric<String> value2 =
                new BoxPrinterGeneric<String>("Hello world");
        System.out.println(value2);
        String intValue2 = value2.getValue();
    }
}
