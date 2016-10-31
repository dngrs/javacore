package com.dngrs.app.homework.lesson7;

public class Lesson7Functions {

    public static int[] fillArray(int startElement, int endElement, int step) {
        int size = 0;
        for(int i = startElement; i <= endElement; i += step){
            size = ++size;
        }
        int[] array = new int[size];
        int index = 0;
        for (int i = startElement; i <= endElement; i += step) {
            array[index++] = i;
        }
        return array;
    }

    public static int[] generateRandomArray(int min, int max, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
        return array;
    }

    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = ++count;
            }
        }
        return count;
    }

    public static int getMinElement(int array[]) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int getMaxElement(int array[]) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static int[][] fillTwoDimArrayRandom(int iSize, int jSize, int min, int max) {
        int[][] array = new int[iSize][jSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = min + (int) (Math.random() * (max - min + 1));
            }
        }
        return array;
    }
}
