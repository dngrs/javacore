package com.dngrs.runners.lesson9;

import com.dngrs.app.homework.lesson4.SortArray;
import com.dngrs.app.homework.lesson7.Lesson7Functions;
import com.dngrs.app.homework.lesson9.MaxArrayElement;
import com.dngrs.app.homework.lesson9.MultiplicationTable;
import com.dngrs.app.homework.lesson9.SortArrayBubble;

import java.util.Scanner;

/**
 * Created by I. Odokienko on 11/5/16.
 */
public class Lesson9HomeworkRunner {
    public static void main(String[] args) {
        int[] array = {-1, 9, -2, 8, -3, 7, -4, 6, -5, 0};
        int[][] array2D = Lesson7Functions.fillTwoDimArrayRandom(5, 8, -99, 99);
        boolean exitCondition = true;
        do {
            System.out.println("Choose one of available item:");
            System.out.println("1 - Sort array with 'bubble sort' algorithm in ascending order");
            System.out.println("2 - Sort array with 'bubble sort' algorithm in descending order");
            System.out.println("3 - Sort array with 'selection sort' algorithm");
            System.out.println("4 - Find max element of 2D array [8][5] filled with random numbers in range [-99; 99]");
            System.out.println("5 - Get 15 unique examples from multiplication table");
            System.out.println("6 - Exit");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int item = scan.nextInt();
                if (item > 0 && item <= 6) {
                    switch (item) {
                        case 1:
                            System.out.println("Input array: ");
                            ArrayPrint.printArray(array);
                            System.out.println("After sorting: ");
                            ArrayPrint.printArray(SortArrayBubble.sortBubbleAsc(array.clone()));
                            break;
                        case 2:
                            System.out.println("Input array: ");
                            ArrayPrint.printArray(array);
                            System.out.println("After sorting: ");
                            ArrayPrint.printArray(SortArrayBubble.sortBubbleDesc(array.clone()));
                            break;
                        case 3:
                            System.out.println("Input array: ");
                            ArrayPrint.printArray(array);
                            System.out.println("After sorting: ");
                            ArrayPrint.printArray(SortArray.sortArray(array.clone()));
                            break;
                        case 4:
                            System.out.println("Input array: ");
                            ArrayPrint.printArray2D(array2D);
                            System.out.println("MAX array element is " + MaxArrayElement.maxElementInArray2D(array2D));
                            break;
                        case 5:
                            System.out.println("15 unique examples: ");
                            MultiplicationTable.getRandomUniqueResults();
                            break;
                        case 6:
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
