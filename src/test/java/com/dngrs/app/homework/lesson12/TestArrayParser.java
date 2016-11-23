package com.dngrs.app.homework.lesson12;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by I. Odokienko on 11/17/16.
 */
@RunWith(value = Parameterized.class)
public class TestArrayParser {
    private static ArrayParser testInstance = null;
    private String input;
    private String separator;
    private int[] expected;

    public TestArrayParser(String input, String separator, int[] expected) {
        this.input = input;
        this.separator = separator;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1,2,3,4,5,6,7,8,9,0", ",", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}},
                {"1#!-2#!3#!-4#!5#!-6#!7#!-8#!9", "#!", new int[]{1,-2,3,-4,5,-6,7,-8,9}},
        });
    }

    @Before
    public void setUp() {
        testInstance = new ArrayParser();
    }

    @Test
    public void testParseArray() {
        Assert.assertArrayEquals(expected, testInstance.parseArray(input, separator));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
