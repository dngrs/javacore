package com.dngrs.app.classwork.lesson17;

import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/30/16.
 */
public class ArraySorterGenerics <T extends Number> {
    private T[] val;

    ArraySorterGenerics (T[] val){
        this.val = val;
    }

    public T[] sort(){
        for (int i = 0; i < val.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < val.length - 1 - i; j++) {
                if (val[j].doubleValue() > val[j + 1].doubleValue()) {
                    swap(val, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return val;
    }

    private void swap(T[] val, int j) {
        T tmp;
        tmp = val[j + 1];
        val[j + 1] = val[j];
        val[j] = tmp;
    }

    public static <K extends Number>K[] sort(K[] arrays){
        ArraySorterGenerics<K> sortGeneric = new ArraySorterGenerics<K>(arrays);
        return sortGeneric.sort();
    }

    public static void main(String[] args) {
        ArraySorterGenerics<Integer> array = new ArraySorterGenerics<Integer>(new Integer[]{2,3,2,4,2,6});
        array.sort();
        System.out.println(Arrays.toString(array.sort()));
        Integer[] sort2 = {2,4,2,5,2};
        sort2 = ArraySorterGenerics.sort(sort2);
        System.out.print(Arrays.toString(sort2));
    }
}
