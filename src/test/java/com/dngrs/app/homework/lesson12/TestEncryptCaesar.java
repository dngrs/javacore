package com.dngrs.app.homework.lesson12;

import com.dngrs.app.homework.lesson10.ReadFromFile;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by I. Odokienko on 11/17/16.
 */
public class TestEncryptCaesar {
    private static final String INPUT_DATA = "src/test/resources/lesson12/EncryptCaesarInput.txt";
    private static final String EXPECTED_RESULTS = "src/test/resources/lesson12/EncryptCaesarExpected.txt";
    private static ArrayList<String> inputData = null;
    private static int[] offset = {0, 3, 10, 20};
    private static ArrayList<String> expectedResult = null;
    private static EncryptCaesar testClassInstance = null;

    @BeforeClass
    public static void preConditionsForClass() throws IOException {
        inputData = ReadFromFile.readStringsFromFile(INPUT_DATA);
        expectedResult = ReadFromFile.readStringsFromFile(EXPECTED_RESULTS);
    }

    @Before
    public void setUp() {
        testClassInstance = new EncryptCaesar();
    }

    @Test
    public void TestCodeCaesar() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.codeCaesar(inputData.get(i), offset[i]), expectedResult.get(i));
        }
    }

    @Test
    public void TestDecodeCaesar() {
        for (int i = 0; i < inputData.size(); i++) {
            Assert.assertEquals(testClassInstance.decodeCaesar(expectedResult.get(i), offset[i]), inputData.get(i));
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
