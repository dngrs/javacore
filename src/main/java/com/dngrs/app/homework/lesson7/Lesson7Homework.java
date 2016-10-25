package com.dngrs.app.homework.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson7Homework {
    //Task 2a
    public static void fillArrayWithEvenNumbers() {
        //Define array size
        int size = 0;
        for (int i = 2; i <= 20; i += 2) {
            size = ++size;
        }
        //Fill array
        int[] array = new int[size];
        int index = 0;
        for (int i = 2; i <= 20; i += 2) {
            array[index++] = i;
        }
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
        //Define array size
        int size = 0;
        for (int i = 1; i <= 99; i += 2) {
            size = ++size;
        }
        //Fill array
        int[] array = new int[size];
        int index = 0;
        for (int i = 1; i <= 99; i += 2) {
            array[index++] = i;
        }
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
        int[] array = new int[15];
        int count = 0;
        //Generate random array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        //Print array
        System.out.println("Generated array: " + Arrays.toString(array));

        //Count number of even elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = ++count;
            }
        }
        System.out.println("Number of even elements is " + count);
    }

    //Task 2d
    public static void getMinMaxElement() {
        //Generate random array
        int[] array = new int[15];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[index++] = (int) (Math.random() * 1000);
        }

        //Print array
        System.out.println("Array: " + Arrays.toString(array));

        //Find MIN and MAX element
        int minElement = array[0];
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        //Print MIN and MAX element
        System.out.println("Min elemext: " + minElement);
        System.out.println("Max elemext: " + maxElement);
    }

    //Task 2e
    public static void printTwoDimensionalArray() {
        //Generate random array
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
            }
        }

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
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 999 + 1);
            }
        }

        //Print array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    //Task 2h
    public static void  getSumOfEnteredElements() {
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
