package com.dngrs.app.homework.lesson10;

import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by I. Odokienko on 11/7/16.
 */
public class TestStringPalindrome {
    private static final String INPUT_DATA = "src/test/resources/lesson10/StringIsPalindromeInput.txt";
    private static final String EXPECTED_RESULTS = "src/test/resources/lesson10/StringIsPalindromeExpected.txt";
    private static ArrayList<String> inputData = null;
    private static ArrayList<Boolean> expectedResults = null;
    private static StringPalindrome testClassInstance = null;

    @BeforeClass
    public static void preConditionsForClass() throws IOException {
        inputData = ReadFromFile.readStringsFromFile(INPUT_DATA);
        expectedResults = ReadFromFile.readBooleanFromFile(EXPECTED_RESULTS);
    }

    @Before
    public void setUp() {
        testClassInstance = new StringPalindrome();
    }

    @Test
    public void testIsPalindromeCompareCharacters() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.isPalindromeCompareCharacters(inputData.get(i)), expectedResults.get(i));
        }
    }

    @Test
    public void testIsPalindromeCompareObjects() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.isPalindromeCompareObjects(inputData.get(i)), expectedResults.get(i));
        }
    }

    @Test
    public void testIsPalindromeRecursively() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.isPalindromeRecursively(inputData.get(i)), expectedResults.get(i));
        }
    }

    @Test
    public void testIsPalindromeStrBuilder() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.isPalindromeStrBuilder(inputData.get(i)), expectedResults.get(i));
        }
    }

    @Test
    public void testIsPalindromeStack() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.isPalindromeStack(inputData.get(i)), expectedResults.get(i));
        }
    }

    @After
    public void tearDown() {
        testClassInstance = null;
    }

    @AfterClass
    public static void postConditionsForClass() {
        inputData = null;
        expectedResults = null;
    }
}
