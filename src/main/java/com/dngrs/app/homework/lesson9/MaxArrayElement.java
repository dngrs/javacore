package com.dngrs.app.homework.lesson9;

/**
 * Created by I. Odokienko on 11/1/16.
 */

public class MaxArrayElement {
    //Find max element of 2D array
    public static int maxElementInArray2D(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Print 2D ArrAY
    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
