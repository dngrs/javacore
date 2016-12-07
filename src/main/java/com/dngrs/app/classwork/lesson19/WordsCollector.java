package com.dngrs.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class WordsCollector {
    public static void main(String[] args) {
        System.out.println("Enter text to write in file. To save changes, type 'exit' and press 'Enter'");
        String line;
        ArrayList<String> resultSet = new ArrayList<>();
        do {
            line = new Scanner(System.in).nextLine();
            if (!line.equals("exit")) {
                resultSet.add(line);
            }
        } while (!line.equals("exit"));
        System.out.println(resultSet);
    }
}
