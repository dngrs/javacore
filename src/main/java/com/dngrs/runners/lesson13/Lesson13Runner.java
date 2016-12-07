package com.dngrs.runners.lesson13;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.dngrs.app.homework.lesson13.PropertyFile.writePropertyFile;
import static com.dngrs.app.homework.lesson13.WriteIntArrayToFile.writeIntArraysToFile;
import static com.dngrs.app.homework.lesson13.WriteIsPalindrome.writeIsPalindromeToFile;
import static com.dngrs.runners.lesson13.WriteTextToFile.writeTextFromBufferToFile;

/**
 * Created by I. Odokienko on 11/22/16.
 */
public class Lesson13Runner {
    public static void main(String[] args) throws IOException{
        boolean exitCondition = true;
        do {
            System.out.println("MENU");
            System.out.println("1 - Read array from file, sort and then write to file");
            System.out.println("2 - Read strings from file, check on palindrome, write to file");
            System.out.println("3 - Write input text to file");
            System.out.println("4 - Create property file");
            System.out.println("5 - Exit program");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int item = scanner.nextInt();
                if (item > 0 && item <= 6) {
                    switch (item) {
                        case 1:
                            String inputFile = "src/test/resources/lesson13/ReadArray.txt";
                            String fileName = "WriteArray.txt";
                            File output = writeIntArraysToFile(inputFile, fileName);
                            break;
                        case 2:
                            String inputFileName = "src/test/resources/lesson13/StringIsPalindromeInput.txt";
                            String outputFileName = "src/test/resources/lesson13/StringIsPalindromeOutput.txt";
                            File file = writeIsPalindromeToFile(inputFileName, outputFileName);
                            break;
                        case 3:
                            System.out.println("Enter File name ");
                            String outputFile = new Scanner(System.in).next();
                            System.out.println("Enter text to write in file. To save changes, type 'exit' and press 'Enter'");
                            String line;
                            ArrayList<String> resultSet = new ArrayList<>();
                            do {
                                line = new Scanner(System.in).nextLine();
                                if (!line.equals("exit")) {
                                    resultSet.add(line);
                                }
                            } while (!line.equals("exit"));
                            File propertyFile = writeTextFromBufferToFile(outputFile, resultSet);
                            break;
                        case 4:
                            ArrayList<String> inputArray = new ArrayList<>();
                            System.out.println("Enter property in format \'name,value\'");
                            String newLine = new Scanner(System.in).nextLine();
                            while (!newLine.isEmpty()){
                                inputArray.add(newLine);
                                newLine = new Scanner(System.in).nextLine();
                            }
                            writePropertyFile(inputArray, "test.txt");
                            break;
                        case 5:
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
