package com.dngrs.app.classwork.lesson12;

import java.util.Scanner;

/**
 * Created by I. Odokienko on 11/9/16.
 */
public class CountWords {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        String inputString = scan.nextLine();
        inputString = inputString.trim();
        for(int i = 0; i < inputString.length(); i++){
            inputString = inputString.replace("  ", " ");
        }
        String[] wordsArray = inputString.split(" ");
        System.out.println("Number of words in string: " + wordsArray.length);
    }
}
