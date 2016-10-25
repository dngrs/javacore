package com.dngrs.utils.runners;


import com.dngrs.app.homework.lesson7.Lesson7Homework;

import java.util.Scanner;

public class Lesson7HomeworkRunner {
    public static void main(String[] args) {
        Lesson7Homework menu = new Lesson7Homework();
        boolean exitCondition = true;

        System.out.println("Choose one of available item:");
        System.out.println("1 - Print array of even numbers in range [2 - 20]");
        System.out.println("2 - Print array of odd numbers in range [1 - 99]");
        System.out.println("3 - Print array of random numbers in range [0 - 9]; print number of its even elements");
        System.out.println("4 - Print array of random numbers in range [0 to 999]; print MIN and MAX array elements");
        System.out.println("5 - Print array [8][5] of random numbers in range [10 - 99]");
        System.out.println("6 - Print right-aligned array [8][5] of random numbers in range [1 - 999]");
        System.out.println("7 - Calculate sum of entered numbers");
        System.out.println("8 - Exit");
        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int item = scan.nextInt();
                if (item>0 && item<=8) {
                    switch (item) {
                        case 1:
                            menu.fillArrayWithEvenNumbers();
                            break;
                        case 2:
                            menu.fillArrayWithOddNumbers();
                            break;
                        case 3:
                            menu.getNumberOfEvenElements();
                            break;
                        case 4:
                            menu.getMinMaxElement();
                            break;
                        case 5:
                            menu.printTwoDimensionalArray();
                            break;
                        case 6:
                            menu.formatTwoDimensionalArray();
                            break;
                        case 7:
                            menu.getSumOfEnteredElements();
                            break;
                        case 8:
                            exitCondition = false;
                            break;
                    }
                } else {
                    System.out.println("Wrong input value. Try again...");
                }
            } else {
                System.out.println("Wrong input value. Try again...");
            }
        } while (exitCondition);
        System.out.println("Exiting program ...");
    }
}
