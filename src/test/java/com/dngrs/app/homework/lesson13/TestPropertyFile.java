package com.dngrs.app.homework.lesson13;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

import static com.dngrs.app.homework.lesson10.ReadFromFile.readStringsFromFile;

/**
 * Created by I. Odokienko on 11/26/16.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPropertyFile {
    private static PropertyFile testInstance = null;
    private static File testFile = null;
    private static ArrayList<String> inputData;
    private static String pathOutputFile = "src/test/resources/lesson13/PropertyFileOutputData.txt";

    @BeforeClass
    public static void setUp() throws IOException {
        testInstance = new PropertyFile();
        inputData = readStringsFromFile("src/test/resources/lesson13/PropertyFileInputData.txt");
        testFile = testInstance.writePropertyFile(inputData, "PropertyFileOutputData.txt");
    }

    @Test
    public void aCheckMethodReturnFile() throws IOException {
        Assert.assertTrue(testFile.isFile());
    }

    @Test
    public void bCheckFilePathIsCorrect() throws IOException {
        Assert.assertEquals(pathOutputFile, testFile.getPath());
    }

    @Test
    public void dChecPropertyFileIsCorrect() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(testFile));
        int actualSizeSize = properties.size();
        BufferedReader reader = new BufferedReader(new FileReader(testFile));
        String line;
        int expectedSize = 0;
        while ((line = reader.readLine()) != null) {
            expectedSize++;
        }
        Assert.assertEquals(actualSizeSize, expectedSize);
    }

    @AfterClass
    public static void tearDown() {
        testInstance = null;
        //testFile.delete();
    }
}
