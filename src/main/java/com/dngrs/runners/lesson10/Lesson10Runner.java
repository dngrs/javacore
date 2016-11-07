package com.dngrs.runners.lesson10;

import com.dngrs.app.homework.lesson10.StringPalindrome;

import java.util.Scanner;

/**
 * Created by I. Odokienko on 11/6/16.
 */
public class Lesson10Runner {
    public static void main(String[] args) {
        boolean exitCondition = true;
        do {
            System.out.println("Enter some string (case of characters does not matter)");
            Scanner scanner1 = new Scanner(System.in);
            String str = scanner1.nextLine();
            System.out.println("To check if string is palindrome, select one of available algorithms:");
            System.out.println("1 - Symbol-wise comparison");
            System.out.println("2 - Object comparison");
            System.out.println("3 - Recursively");
            System.out.println("4 - Using StringBuilder");
            System.out.println("5 - Using Stack");
            System.out.println("6 - Exit program");
            Scanner scanner2 = new Scanner(System.in);
            if (scanner2.hasNextInt()) {
                int item = scanner2.nextInt();
                if (item > 0 && item <= 6) {
                    switch (item) {
                        case 1:
                            System.out.println("String \'" + str + "\' is palindrome :" + StringPalindrome.isPalindromeCompareCharacters(str));
                            break;
                        case 2:
                            System.out.println("String \'" + str + "\' is palindrome :" + StringPalindrome.isPalindromeCompareObjects(str));
                            break;
                        case 3:
                            System.out.println("String \'" + str + "\' is palindrome :" + StringPalindrome.isPalindromeRecursively(str));
                            break;
                        case 4:
                            System.out.println("String \'" + str + "\' is palindrome :" + StringPalindrome.isPalindromeStrBuilder(str));
                            break;
                        case 5:
                            System.out.println("String \'" + str + "\' is palindrome :" + StringPalindrome.isPalindromeStack(str));
                            break;
                        case 6:
                            exitCondition = false;
                            break;
                    }
                } else {
                    System.out.println("Wrong input value. Try again...");
                }
            } else {
                System.out.println("Wrong input value. Try again...");
            }
        } while (exitCondition);
        System.out.println("Exiting program ...");
    }
}
