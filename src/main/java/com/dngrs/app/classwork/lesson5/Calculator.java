package com.dngrs.app.classwork.lesson5;

public class Calculator {

    public static double calculateCircleArea(double radius) {
        double circleArea = Math.pow(radius, 2) * Math.PI;
        return circleArea;
    }

    public static double calculateBigger(double area1, double area2) {
        double max;
        if (area1 > area2) {
            System.out.println("area1 > area2");
            return area1;
        } else if (area1 < area2) {
            System.out.println("area2 > area1");
            return area2;
        } else {
            System.out.println("area1 = area2");
            return area1;
        }
    }

    public static boolean rightAngledCheck(double a, double b, double c) {
        if ((c * c == a * a + b * b) || (a * a == b * b + c * c) || (b * b == a * a + b * b)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if ((number % 2) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
