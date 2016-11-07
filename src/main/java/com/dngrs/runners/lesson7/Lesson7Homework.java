package com.dngrs.runners.lesson7;

import java.util.Arrays;
import java.util.Scanner;

import static com.dngrs.app.homework.lesson7.Lesson7Functions.*;

public class Lesson7Homework {
    //Task 2a
    public static void fillArrayWithEvenNumbers() {
        //Fill array
        int[] array = fillArray(2, 20, 2);
        //Print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Print array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Task 2b
    public static void fillArrayWithOddNumbers() {
        //Define array size and fill array
        int[] array = fillArray(1, 99, 2);
        //Print array in one line
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Print array in one row
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Task 2c
    public static void getNumberOfEvenElements() {
        //Generate random Array
        int[] array = generateRandomArray(0, 9, 15);
        //Print array
        System.out.println("Generated array: " + Arrays.toString(array));
        //Count number of even elements
        int count = countEvenElements(array);
        System.out.println("Number of even elements is " + count);
    }

    //Task 2d
    public static void getMinMaxElement() {
        //Generate random array
        int[] array = generateRandomArray(0, 999, 15);
        //Print array
        System.out.println("Array: " + Arrays.toString(array));
        //Find MIN and MAX element
        int minElement = getMinElement(array);
        int maxElement = getMaxElement(array);
        //Print MIN and MAX element
        System.out.println("Min elemext: " + minElement);
        System.out.println("Max elemext: " + maxElement);
    }

    //Task 2e
    public static void printTwoDimensionalArray() {
        //Generate random array
        int[][] array = fillTwoDimArrayRandom(8, 5, 10, 99);
        //Print array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task 2g
    public static void formatTwoDimensionalArray() {
        //Generate random array
        int[][] array = fillTwoDimArrayRandom(8, 5, 1, 999);
        //Print array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    //Task 2h
    public static void getSumOfEnteredElements() {
        String exit = "exit";
        boolean condition = true;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sequence of INT numbers");
        System.out.println("To get sum of entered numbers and quit program enter \"exit\"");
        do {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                sum = sum + i;
            } else if (scan.hasNext()) {
                String input = scan.next();
                if (input.equals(exit)) {
                    condition = false;
                } else {
                    System.out.println("Wrong input. Enter correct value");
                }
            }
        } while (condition);
        System.out.println("Sum of entered numbers is " + sum);
    }
}
