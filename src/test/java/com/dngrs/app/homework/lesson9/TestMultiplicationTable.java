package com.dngrs.app.homework.lesson9;

import org.junit.*;
import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/6/16.
 */
public class TestMultiplicationTable {
    private MultiplicationTable table = null;

    @Test
    public void checkArraySize() {
        int [][] array = table.getRandomUniqueResults();
        Assert.assertEquals(15, array.length);
        for(int i = 0; i<array.length; i++){
            Assert.assertEquals(3, array[i].length);
        }
    }

    @Test
    public void checkDataAreCorrect() {
        int[][] array = table.getRandomUniqueResults();
        for (int i = 0; i < array.length; i++) {
            Assert.assertEquals(array[i][0] * array[i][1], array[i][2]);
        }
    }

    @Test
    public void checkResultsAreUnique() {
        int[][] array = table.getRandomUniqueResults();
        int[] results = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            results[i] = array[i][2];
        }
        Arrays.sort(results);
        for (int i = 0; i < results.length - 1; i++){
            Assert.assertTrue(results[i]<results[i+1]);
        }
    }

    @Before
    public void setUp() {
        MultiplicationTable table = new MultiplicationTable();
    }

    @After
    public void tearDown() {
        table = null;
    }
}
