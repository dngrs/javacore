package com.dngrs.app.classwork.lesson3;

/**
 * Created by admin on 10/8/16.
 */
public class NarrowingCasting {
    static int int1 = 0;
    static float float1 = 3.14159f;

    public static void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);
    }
}
