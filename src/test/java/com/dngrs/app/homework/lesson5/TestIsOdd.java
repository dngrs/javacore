package com.dngrs.app.homework.lesson5;

import com.dngrs.app.classwork.lesson5.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestIsOdd {
    private static Calculator calc = null;
    private int input;
    private boolean expected;

    public TestIsOdd(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} is odd number: {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, false}, {1, true}, {2, false}, {3, true}, {4, false}, {5, true},
        });
    }

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testIsOdd() {
        Assert.assertEquals(expected, calc.isOdd(input));
    }

    @After
    public void tearDwon() {
        calc = null;
    }
}

