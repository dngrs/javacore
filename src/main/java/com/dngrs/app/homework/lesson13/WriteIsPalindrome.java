package com.dngrs.app.homework.lesson13;

import com.dngrs.app.homework.lesson10.StringPalindrome;

import java.io.*;

/**
 * Created by I. Odokienko on 11/12/16.
 */
public class WriteIsPalindrome {

    public static File writeIsPalindromeToFile(String inputFileName, String outputFileName) throws IOException {
        File outputFile = new File(outputFileName);
        String myLine;
        BufferedReader reader = new BufferedReader(
                new FileReader(inputFileName)
        );
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(outputFile)
                )
        );
        while ((myLine = reader.readLine()) != null) {
            writer.append(myLine + " is palindrome: " + String.valueOf(StringPalindrome.isPalindromeStrBuilder(myLine)));
            writer.newLine();
        }
        reader.close();
        writer.close();
        return outputFile;
    }
}
