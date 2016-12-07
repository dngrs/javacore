package com.dngrs.app.homework.lesson13;

import org.junit.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by I. Odokienko on 11/24/16.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestWriteIntArrayToFile {
    private static WriteIntArrayToFile testInstance = null;
    private static File testFile = null;
    private static String path = "src/test/resources/lesson13/ReadArray.txt";
    private static String file = "MyFile.txt";

    @BeforeClass
    public static void setUp() throws IOException {
        testInstance = new WriteIntArrayToFile();
        testFile = testInstance.writeIntArraysToFile(path, file);
    }

    @Test
    public void aCheckMethodReturnFile() throws IOException {
        Assert.assertTrue(testFile.isFile());
    }

    @Test
    public void bCheckFileNameIsCorrect() {
        Assert.assertEquals(file, testFile.getName());
    }

    @Test
    public void cCheckLineCountIsSame() throws IOException {
        int inputCount = countLine(path);
        int outputCount = countLine(testFile.getAbsolutePath());
        Assert.assertEquals(inputCount, outputCount);
    }

    @Test
    public void dCheckArrayIsSorted() throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(testFile));
        String line;
        while ((line = read.readLine()) != null) {
            line = line.replace("[", "");
            line = line.replace("]", "");
            line = line.replace(" ", "");
            String[] numbers = line.split(",");
            int[] array = testInstance.fromStringArray(numbers);
            for (int i = 0; i < array.length - 1; i++) {
                Assert.assertTrue(array[i] <= array[i + 1]);
            }
        }
    }

    @AfterClass
    public static void tearDown() {
        testInstance = null;
        testFile.delete();
    }

    public static int countLine(String path) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(new File(path)));
        String line;
        int lineCount = 0;
        while ((line = input.readLine()) != null) {
            ++lineCount;
        }
        return lineCount;
    }
}
