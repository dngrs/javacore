package com.dngrs.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by admin on 10/29/16.
 */
public class SortArrayBubble {
    public static void main(String[] args) {
        int[] array = {5,4,2,1,3};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array,j);
                    count = ++count;
                }
            }
            if (count == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int j){
        int tmp = 0;
        tmp = array[j + 1];
        array[j + 1] = array[j];
        array[j] = tmp;
    }

}
