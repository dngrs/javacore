package com.dngrs.app.homework.lesson7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestGetMaxElement {
    private static Lesson7Functions testInstance = null;
    private int[] inputArray;
    private int expected;

    public TestGetMaxElement(int[] inputArray, int expected) {
        this.inputArray = inputArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-1, -3, -5, -7, -9, -11}, -1},
                {new int[]{2, -4, 6, -8, 10, -12, 14, -16, 18, -20}, 18},
                {new int[]{6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5}, 10},
        });
    }

    @Before
    public void setUp() {
        testInstance = new Lesson7Functions();
    }

    @Test
    public void testFillArray() {
        Assert.assertEquals(expected, testInstance.getMaxElement(inputArray));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
