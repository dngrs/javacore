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
public class TestFillArray {
    private static Lesson7Functions testInstance = null;
    private int[] expected;
    private int startElement;
    private int endElement;
    private int step;

    public TestFillArray(int[] expected, int startElement, int endElement, int step) {
        this.expected = expected;
        this.startElement = startElement;
        this.endElement = endElement;
        this.step = step;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 5, 7, 9, 11}, 1, 12, 2},
                {new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 2, 20, 2},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1, 10, 1},
                {new int[]{0, 3, 6, 9, 12, 15, 18}, 0, 20, 3}
        });
    }

    @Before
    public void setUp() {
        testInstance = new Lesson7Functions();
    }

    @Test
    public void testFillArray() {
        Assert.assertArrayEquals(expected, testInstance.fillArray(startElement, endElement, step));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
