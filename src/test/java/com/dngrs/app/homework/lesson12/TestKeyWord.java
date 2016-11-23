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
public class TestKeyWord {
    private static KeyWord testInstance = null;
    private String input;
    private String key;
    private String[] expected;

    public TestKeyWord(String input, String key, String[] expected) {
        this.key = key;
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"I love my nasty cat", "nasty", new String[] {"I love my ", " cat"}},
                {"", "test", new String[]{""}},
                {"test test", "", new String[]{"t", "e", "s", "t", " " , "t", "e", "s", "t"}},
        });
    }

    @Before
    public void setUp() {
        testInstance = new KeyWord();
    }

    @Test
    public void testDivideString() {
        Assert.assertArrayEquals(expected,testInstance.divideString(input, key));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
