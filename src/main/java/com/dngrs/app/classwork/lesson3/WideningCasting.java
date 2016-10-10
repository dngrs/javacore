package com.dngrs.app.classwork.lesson3;

/**
 * Created by admin on 10/8/16.
 */
public class WideningCasting {
    static byte byte1 = 127;
    static short short1 = 0;
    static int int1 = 0;
    static long long1 = 0;
    static float float1 = 0;
    static double double1 = 0;

    public static void main(String[] args) {
        double1 = float1 =long1= int1 = short1= byte1;
        System.out.println(double1);
    }
}
