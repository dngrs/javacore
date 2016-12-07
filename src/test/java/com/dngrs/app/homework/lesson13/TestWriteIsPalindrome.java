package com.dngrs.app.homework.lesson13;

import org.junit.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by I. Odokienko on 11/26/16.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestWriteIsPalindrome {
    private static WriteIsPalindrome testInstance = null;
    private static File testFile = null;
    private static String pathInputFile = "src/test/resources/lesson13/StringIsPalindromeInput.txt";
    private static String pathOutputFile = "src/test/resources/lesson13/StringIsPalindromeOutput.txt";

    @BeforeClass
    public static void setUp() throws IOException {
        testInstance = new WriteIsPalindrome();
        testFile = testInstance.writeIsPalindromeToFile(pathInputFile, pathOutputFile);
    }

    @Test
    public void aCheckMethodReturnFile() throws IOException {
        Assert.assertTrue(testFile.isFile());
    }

    public void aCheckFilePathIsCorrect() throws IOException {
        Assert.assertEquals(pathOutputFile, testFile.getPath());
    }

    @Test
    public void cCheckLineCountIsSame() throws IOException {
        int inputCount = TestWriteIntArrayToFile.countLine(pathInputFile);
        int outputCount = TestWriteIntArrayToFile.countLine(pathOutputFile);
        Assert.assertEquals(inputCount, outputCount);
    }

    @Test
    public void dCheckOutputFileStructure() throws IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(new File(pathInputFile)));
        BufferedReader outputFile = new BufferedReader(new FileReader(testFile));
        String line;
        while ((line = outputFile.readLine()) != null) {
            String[] output = line.split(" is palindrome: ");
            Assert.assertEquals(inputFile.readLine(), output[0]);
            Assert.assertTrue(output[1].equals("true") || output[1].equals("false"));
        }
    }

    @AfterClass
    public static void tearDown() {
        testInstance = null;
        //testFile.delete();
    }
}
