package com.dngrs.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        int theSize = myList.size();
        System.out.println(theSize);
        System.out.println(myList.indexOf(string1));
        boolean isIn = myList.contains(string2);
        System.out.println("isIn: " + isIn);
        int index = myList.indexOf(string2);
        System.out.println("index " + index);
        boolean isEmpty = myList.isEmpty();
        System.out.println("isEmpty " + isEmpty);
        myList.remove(string1);
        isIn = myList.contains(string1);
        System.out.println("isIn: " + isIn);
        myList.add(string1);
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
        Collections.reverse(myList);
        System.out.println(myList);
    }
}
