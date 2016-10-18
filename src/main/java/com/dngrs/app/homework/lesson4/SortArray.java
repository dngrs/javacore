package com.dngrs.app.homework.lesson4;

public class SortArray {
    public static int [] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int tmp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = tmp;
            }
        }
        return arr;
    }
}
