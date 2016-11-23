package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class Runner {
    public static void main(String[] args) {
        Person pers;

        pers = new Teacher("Teach", "HI");
        System.out.println(pers.getResponce("responce"));
        pers = new Student("Stud", "Heloo");
        System.out.println(pers.getResponce("responce"));
    }
}
