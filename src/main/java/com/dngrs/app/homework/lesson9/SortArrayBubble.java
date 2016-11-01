package com.dngrs.app.homework.lesson9;

/**
 * Created by admin on 10/29/16.
 */

public class SortArrayBubble {
    //
    public static int[] sortBubbleAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return array;
    }

    public static int[] sortBubbleDes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        int tmp = 0;
        tmp = array[j + 1];
        array[j + 1] = array[j];
        array[j] = tmp;
    }
}
