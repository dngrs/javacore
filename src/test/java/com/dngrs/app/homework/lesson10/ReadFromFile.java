package com.dngrs.app.homework.lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by I. Odokienko on 11/7/16.
 */

public class ReadFromFile {
    public static ArrayList<String> readStringsFromFile(String path) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            result.add(line);
        }
        reader.close();
        return result;
    }

    public static ArrayList<Boolean> readBooleanFromFile(String path) throws IOException {
        ArrayList<Boolean> result = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            result.add(Boolean.valueOf(line));
        }
        reader.close();
        return result;
    }
}
