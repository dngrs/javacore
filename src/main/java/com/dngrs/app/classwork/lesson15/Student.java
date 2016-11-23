package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class Student extends Person {
    String university;

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    @Override
    public String getResponce(String question){
        return "test";
    }

    @Override
    public String getName(){
        return super.name;
    }
}
