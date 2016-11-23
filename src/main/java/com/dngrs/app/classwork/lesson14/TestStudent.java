package com.dngrs.app.classwork.lesson14;

/**
 * Created by I. Odokienko on 11/16/16.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("MyName", "MyUniversity");
        System.out.println(student.getResponce("QWE"));
        System.out.println(student.returnName());
        System.out.println(student.returnUniversity());
        System.out.println(student.name);
        System.out.println(student.university);
        student.setGrade("first");
        System.out.println("Grade is: " + student.getGrade());
    }
}
