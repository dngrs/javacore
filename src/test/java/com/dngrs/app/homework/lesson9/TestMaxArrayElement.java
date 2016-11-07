package com.dngrs.app.homework.lesson9;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by I. Odokienko on 11/6/16.
 */

@RunWith(value = Parameterized.class)
public class TestMaxArrayElement {
    private static MaxArrayElement testInstance = null;
    private int[][] inputArray;
    private int expected;

    public TestMaxArrayElement(int[][] inputArray, int expected) {
        this.inputArray = inputArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new int[][]{
                                new int[]{-1, -3, -5, -7, -9, -11},
                                new int[]{-10, -8, -6, -4, -2, 0},
                        },
                        0
                },
                {
                        new int[][]{
                                new int[]{2, -4, 6, -8, 10, -12, 14, -16, 18},
                                new int[]{-2, 4, -6, 8, -10, 12, -14, 16, -18}
                        },
                        18
                },
                {
                        new int[][]{
                                new int[]{1},
                                new int[]{1, 2},
                                new int[]{1, 2, 3},
                                new int[]{1, 2, 3, 4},
                        },
                        4
                }
        });
    }

    @Before
    public void setUp() {
        testInstance = new MaxArrayElement();
    }

    @Test
    public void testMaxElementInArray2D() {
        Assert.assertEquals(expected, testInstance.maxElementInArray2D(inputArray));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
