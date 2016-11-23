package com.dngrs.app.classwork.lesson14;

/**
 * Created by I. Odokienko on 11/16/16.
 */
public class Student extends Person {

    protected String university;
    private String grade;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getResponce(String question) {
        return "What was the question?";
    }

    public String returnUniversity() {
        return university;
    }

    public String returnName() {
        return name;
    }
}
