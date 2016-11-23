package com.dngrs.app.homework.lesson12;

import com.dngrs.app.homework.lesson10.ReadFromFile;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by I. Odokienko on 11/17/16.
 */

public class TestPrintLetters {
    private static final String INPUT_DATA = "src/test/resources/lesson12/PrintLettersInput.txt";
    private static final String EXPECTED_RESULTS = "src/test/resources/lesson12/PrintLettersExpected.txt";
    private static ArrayList<String> inputData = null;
    private static ArrayList<String> expectedResult = null;
    private static PrintLetters testClassInstance = null;

    @BeforeClass
    public static void preConditionsForClass() throws IOException {
        inputData = ReadFromFile.readStringsFromFile(INPUT_DATA);
        expectedResult = ReadFromFile.readStringsFromFile(EXPECTED_RESULTS);
    }

    @Before
    public void setUp() {
        testClassInstance = new PrintLetters();
    }

    @Test
    public void testPrintLetters() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.printLetters(inputData.get(i)), expectedResult.get(i));
        }
    }

    @After
    public void tearDown() {
        testClassInstance = null;
    }

    @AfterClass
    public static void postConditionsForClass() {
        inputData = null;
        expectedResult = null;
    }
}
