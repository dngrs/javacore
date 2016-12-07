package com.dngrs.app.classwork.lesson19;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Word> resultSet = new HashSet<>();
        String line;
        do {
            line = new Scanner(System.in).nextLine();
            if (!line.equals("exit")) {
                resultSet.add(new Word(line));
            }
        } while (!line.equals("exit"));
        System.out.println(resultSet);
    }
}
