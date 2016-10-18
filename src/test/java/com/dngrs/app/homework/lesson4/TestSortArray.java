package com.dngrs.app.homework.lesson4;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


public class TestSortArray {

    @Test(expected = java.lang.NullPointerException.class)
    public void testNullArray() {
        int [] array = null;
        SortArray.sortArray(array);
    }

    @Test
    public void testArrayIsSortedInAscendingOrder() {
        int [] arrayBeforeSort = {10,8,2,4,6,6};
        int arrayLength = arrayBeforeSort.length;
        SortArray.sortArray(arrayBeforeSort);
        for (int i=0; i<arrayLength-1;i++){
            assertTrue((arrayBeforeSort[i] <= arrayBeforeSort[i + 1]));
        }
    }

    @Test
    public void testArrayWithEvenNumberOfElements(){
        int [] arrayBeforeSort = {0,9,8,7,6,5,4,3,2,1};
        int [] arrayAfterSort = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithOddNumberOfElements(){
        int [] arrayBeforeSort = {0,9,8,7,6,5,4,3,2};
        int [] arrayAfterSort = {0,2,3,4,5,6,7,8,9};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithNonInitializedElements(){
        int [] arrayBeforeSort = new int[5];
        int [] arrayAfterSort = {0,0,0,0,0};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithZeroLength(){
        int [] arrayBeforeSort = new int[0];
        int [] arrayAfterSort = new int [0];
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithOneElement(){
        int [] arrayBeforeSort = {5};
        int [] arrayAfterSort = {5};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithNegativeElements(){
        int [] arrayBeforeSort = {-1,-3,-2,-4,-5,-7,-6,-8,-9,0};
        int [] arrayAfterSort = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithDuplicatedElements(){
        int [] arrayBeforeSort = {8,8,2,2,6,6,3,3,-1,-1};
        int [] arrayAfterSort = {-1,-1,2,2,3,3,6,6,8,8};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithBoundaryValues(){
        int [] arrayBeforeSort = {Integer.MAX_VALUE+1,Integer.MAX_VALUE,Integer.MIN_VALUE-1,Integer.MIN_VALUE};
        int [] arrayAfterSort = {-2147483648, -2147483648, 2147483647, 2147483647};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

}
