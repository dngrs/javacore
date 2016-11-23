package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class Teacher extends Person{
    String university;
    public Teacher(String name, String university){
        super(name);
        this.university = university;
    }

    public void printOnTable(){
        System.out.println("Test");
    }

    @Override
    public String getName(){
        return super.name;
    }
}
