package com.dngrs.app.homework.lesson9;

/**
 * Created by I. Odokienko on 11/1/16.
 */
public class MultiplicationTable {
    
    public static int[][] generateMultiplicationTable() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void getRandomElement(int[][] array) {
        int[] result = new int[15];
        int count = 0;
        boolean unique = false;
        while (count < 15) {
            int randomI = 1 + (int) (Math.random() * 8);
            int randomJ = 1 + (int) (Math.random() * 8);
            for (int j = 0; j < result.length; j++) {
                if (array[randomI][randomJ] != result[j]) {
                    unique = true;
                } else {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result[count] = array[randomI][randomJ];
                System.out.println((randomI + 1) + " * " + (randomJ + 1) + " = " + array[randomI][randomJ]);
                count++;
            }
        }
    }
}
