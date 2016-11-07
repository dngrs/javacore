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
public class TestSortArrayBubble {
    private static SortArrayBubble testInstance = null;
    private int[] array;

    public TestSortArrayBubble(int[] array){
        this.array = array;
    }

    @Before
    public void setUp() {
        testInstance = new SortArrayBubble();
    }

    @Test
    public void testSortBubbleAsc() {
        testInstance.sortBubbleAsc(array);
        for (int i = 0; i < array.length - 1; i++){
            Assert.assertTrue(array[i]<=array[i+1]);
        }
    }

    @Test
    public void testSortBubbleDesc() {
        testInstance.sortBubbleDesc(array);
        for (int i = 0; i < array.length - 1; i++){
            Assert.assertTrue(array[i]>=array[i+1]);
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1-1,-3,-2,-4,-5,-7,-6,-8,-9,0}},
                {new int[]{1,-3,2,-4,5,-7,6,-8,9}},
                {new int[]{10,8,2,4,6,6}},
        });
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
