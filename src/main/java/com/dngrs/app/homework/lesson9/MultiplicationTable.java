package com.dngrs.app.homework.lesson9;

/**
 * Created by I. Odokienko on 11/5/16.
 */
public class MultiplicationTable {
    public static int[][] getRandomUniqueResults() {
        int[][] array = new int[15][3];
        int count = 0;
        int indexI = 0;
        while (count < 15) {
            boolean unique = false;
            int randomI = 2 + (int) (Math.random() * 8);
            int randomJ = 2 + (int) (Math.random() * 8);
            int result = randomI * randomJ;
            for (int i = 0; i < array.length; i++) {
                if (array[i][array[i].length - 1] != result) {
                    unique = true;
                } else {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                array[count][0] = randomI;
                array[count][1] = randomJ;
                array[count][2] = result;
                System.out.println(randomI + " * " + randomJ + " = " + array[count][2]);
                ++count;
            }
        }
        return array;
    }
}
