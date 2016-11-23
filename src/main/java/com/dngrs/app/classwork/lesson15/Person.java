package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public abstract class Person implements Human{
    protected String name;

    protected Person(String name){
        this.name = name;
    }

    public String getResponce(String question){
        return question;
    }

}
