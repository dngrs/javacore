package com.dngrs.app.homework.lesson6;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.*;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class TestFibonacci {
    private static Fibonacci fib = null;
    private int expected;
    private int input;

    public TestFibonacci(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters (name = "{index}: The {0} element of fibonacci sequence is ={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-1, -1}, {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}
        });
    }

    @Before
    public void setUp() {
        fib = new Fibonacci();
    }

    @Test
    public void testFibonacci() {
        Assert.assertEquals(expected, fib.fibonacci(input));
        //System.out.println("The " +input +" element of fibonacci sequence is " + expected);
    }

    @After
    public void tearDwon() {
        fib = null;
    }
}
