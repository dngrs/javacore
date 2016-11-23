package com.dngrs.app.classwork.lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 11/12/16.
 */
public class StringSplit {
    public static void main(String[] args) {
        System.out.println("Enter numbers using comma delimiter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(",");
        int[] intArray = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) intArray[i] = Integer.valueOf(splittedStringArray[i]);
        System.out.println(Arrays.toString(splittedStringArray).replace("[", "").replace("]", ""));

    }
}
