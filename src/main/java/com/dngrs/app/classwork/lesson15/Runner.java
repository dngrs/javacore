package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class Runner {
    public static void main(String[] args) {
        Student student = new Student("Egor", "Kit Center");
        System.out.println(student.getResponce("What is class?"));

        Teacher teacher = new Teacher("Ivan", "Kit Center");
        System.out.println(teacher.getResponce("What is class?"));

        Person person = new Student("Max", "Kit Center");
        System.out.println(person.getResponce("What is class?"));

        person = new Teacher("Evgen","Kit Center");
        System.out.println(person.getResponce("What is class?"));

    }
}
