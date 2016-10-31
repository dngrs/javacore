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
public class TestRightAngledCheck {
    private double sideA;
    private double sideB;
    private double sideC;
    private boolean isRightAngled;
    private Calculator testClassInstance = null;

    public TestRightAngledCheck(double sideA, double sideB, double sideC, boolean isRightAngled) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.isRightAngled = isRightAngled;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 4, 5, true},
                {4, 3, 5, true},
                {5, 4, 3, true},
                {15, 20, 25, true},
                {5, 4, 4, false}
        });
    }

    @Test
    public void testRightAngledTriangle() {
        Assert.assertEquals(testClassInstance.rightAngledCheck(sideA, sideB, sideC), isRightAngled);
    }

    @Before
    public void setUp() {
        testClassInstance = new Calculator();
    }

    @After
    public void tearDown() {
        testClassInstance = null;
    }
}
