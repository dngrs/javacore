package com.dngrs.app.homework.lesson6;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestArrayIsPolindrom {
    private boolean isPolindrom;
    private int[] array;
    private ArrayIsPolindrom testClassInstance;

    public TestArrayIsPolindrom(int[] array, boolean isPolindrom) {
        this.array = array;
        this.isPolindrom = isPolindrom;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1}, true},
                {new int[]{0, 0, 0, 0}, true},
                {new int[]{1, 2, 2, 1}, true},
                {new int[]{1, 2, 3, 2, 1}, true},
                {new int[]{1, 2, 3, 4, 2, 1}, false},
        });
    }

    @Test
    public void checkPolindromArray() {
        Assert.assertEquals(ArrayIsPolindrom.isPolindrom(array), isPolindrom);
        System.out.println("Array " + Arrays.toString(array) + " is polindrom: " + isPolindrom);
    }

    @Before
    public void setUp() {
        testClassInstance = new ArrayIsPolindrom();
    }

    @After
    public void tearDown() {
        testClassInstance = null;
    }
}
