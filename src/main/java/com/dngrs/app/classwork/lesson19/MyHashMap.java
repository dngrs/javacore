package com.dngrs.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class MyHashMap {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> resultMap = new HashMap<>();
        String category;
        do {
            System.out.println("Enter Category");
            category = new Scanner(System.in).nextLine();
            if (!category.equals("exit")) {
                ArrayList<String> words = new ArrayList<>();
                String sWord;
                System.out.println("Enter Words");
                do{
                    sWord = new Scanner(System.in).nextLine();
                    if (!category.equals("exit")){
                        words.add(sWord);
                    }

                }while(!sWord.equals("exit"));
                resultMap.put(category, words);
            }
        } while (!category.equals("exit"));
        System.out.println(resultMap);
    }
}
