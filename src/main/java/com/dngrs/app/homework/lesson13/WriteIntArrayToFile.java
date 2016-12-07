package com.dngrs.app.homework.lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/18/16.
 */
public class WriteIntArrayToFile {
    public static File writeIntArraysToFile(String inputFileNamePath, String OutputFileName) throws IOException {
        ArrayList<int[]> array = readIntArrayFromFile(inputFileNamePath);
        File file = new File("src/test/resources/lesson13/" + OutputFileName);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file)
                )
        );
        String line;
        for (int[] element : array) {
                Arrays.sort(element);
                writer.append(Arrays.toString(element));
                writer.newLine();
        }
        writer.close();
        return file;
    }

    private static ArrayList<int[]> readIntArrayFromFile(String path) throws IOException {
        ArrayList<int[]> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(",");
            result.add(fromStringArray(numbers));
        }
        reader.close();
        return result;
    }

    public static int[] fromStringArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.valueOf(array[i]);
        }
        return result;
    }
}
