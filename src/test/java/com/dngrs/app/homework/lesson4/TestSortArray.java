package com.dngrs.app.homework.lesson4;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

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
    public void testArrayWithPositiveElements(){
        int [] arrayBeforeSort = {1,3,2,4,5,7,6,8,9};
        int [] arrayAfterSort = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithPositiveNegativeElements(){
        int [] arrayBeforeSort = {1,-3,2,-4,5,-7,6,-8,9};
        int [] arrayAfterSort = {-8,-7,-4,-3,1,2,5,6,9};
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
        int [] arrayBeforeSort = {Integer.MAX_VALUE, Integer.MAX_VALUE-1,Integer.MIN_VALUE, Integer.MIN_VALUE +1};
        int [] arrayAfterSort = {-2147483648, -2147483647, 2147483646, 2147483647};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithOutOfBoundaryValues(){
        int [] arrayBeforeSort = {Integer.MAX_VALUE+1,0,1,Integer.MIN_VALUE-1};
        int [] arrayAfterSort = {-2147483648, 0, 1, 2147483647};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testLengthOfSortedArray(){
        int [] arrayBeforeSort = {9,1,2,8,3,7,4,6};
        int lengthBeforeSort = arrayBeforeSort.length;
        assertTrue(lengthBeforeSort == SortArray.sortArray(arrayBeforeSort).length);
    }

    @Test (timeout=3000)
    public void testPerformanceOfSorting(){
        int [] arrayBeforeSort = new int[100000];
        SortArray.sortArray(arrayBeforeSort);
    }

    @Test
    public void testPerformanceCompareWithLibraryMethod(){
        int [] arrayBeforeSort = new int[100000];
        long timestampBeforeSort = System.currentTimeMillis();
        SortArray.sortArray(arrayBeforeSort);
        long timestampAfterSort = System.currentTimeMillis();
        double executionTime1 = timestampAfterSort - timestampBeforeSort;
        timestampBeforeSort = System.currentTimeMillis();
        Arrays.sort(arrayBeforeSort);
        timestampAfterSort = System.currentTimeMillis();
        double executionTime2 = timestampAfterSort - timestampBeforeSort;
        assertTrue(executionTime2/executionTime1 >0.001);
    }

    @Test
    public void testArrayWithEqualElements(){
        int [] arrayBeforeSort = {1,1,1,1,1,1,1,1,1,1};
        int [] arrayAfterSort = {1,1,1,1,1,1,1,1,1,1};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }


    @Test
    public void testArrayIsSame(){
        int [] arrayBeforeSort = {5,4,3,2,1};
        int [] arrayAfterSort = arrayBeforeSort;
        assertSame(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayIsNotNull(){
        int [] arrayBeforeSort = {5,4,3,2,1};
        assertNotNull(SortArray.sortArray(arrayBeforeSort));
    }

    @Test
    public void testArrayWithZeroElements(){
        int [] arrayBeforeSort = {0,0,0};
        int [] arrayAfterSort = {0,0,0};
        assertArrayEquals(arrayAfterSort, SortArray.sortArray(arrayBeforeSort));
    }
}
