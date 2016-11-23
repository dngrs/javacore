package com.dngrs.app.classwork.lesson14;

/**
 * Created by I. Odokienko on 11/16/16.
 */
public class Person {
    protected String name;

    protected Person(String name){
        this.name = name;
    }

    protected String returnName(){
        return name + 1;
    }
}
