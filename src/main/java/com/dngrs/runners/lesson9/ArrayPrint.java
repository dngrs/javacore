package com.dngrs.runners.lesson9;

/**
 * Created by I. Odokienko on 11/6/16.
 */
public class ArrayPrint {
    //Print 2D ArrAY
    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
