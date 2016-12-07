package com.dngrs.app.homework.lesson19;

/**
 * Created by I. Odokienko on 12/6/16.
 */
public class Person {
    private String name;
    private String telephoneNumber;
    private static int id = 0;
    private int recordId;

    public Person(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        recordId = ++id;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getId(){
        return recordId;
    }
}

