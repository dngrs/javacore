package com.dngrs.app.homework.lesson14;

/**
 * Created by I. Odokienko on 11/26/16.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            System.out.println("New age setted");
        } else {
            System.out.println("Age invalid");
        }
    }
}
